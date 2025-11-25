package com.example.banqueservice.controllers;


import com.example.banqueservice.entities.Compte;
import com.example.banqueservice.entities.Transaction;
import com.example.banqueservice.entities.TypeTransaction;
import com.example.banqueservice.repositories.CompteRepository;
import com.example.banqueservice.repositories.TransactionRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class TransactionControllerGraphQL {


}
