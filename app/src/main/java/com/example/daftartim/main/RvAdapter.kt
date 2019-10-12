package com.example.daftartim.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.daftartim.R
import com.example.daftartim.data.model.TeamResponse.Team
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_item.iv_tim
import kotlinx.android.synthetic.main.list_item.tv_tim_name
import kotlinx.android.synthetic.main.list_item.tv_tim_stadium

class RvAdapter(val list: List<Team>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false))
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
    }

    class ViewHolder(override val containerView: View) :RecyclerView.ViewHolder(containerView),LayoutContainer {
        fun bindData(team: Team){
            tv_tim_name.text=team.strTeam
            tv_tim_stadium.text=team.strStadium
            Glide.with(containerView).load(team.strTeamLogo).into(iv_tim)
        }
    }
}