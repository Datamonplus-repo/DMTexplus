package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class colorserviceactualizaciondeconsumos extends GXProcedure
{
   public colorserviceactualizaciondeconsumos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorserviceactualizaciondeconsumos.class ), "" );
   }

   public colorserviceactualizaciondeconsumos( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        String aP1 ,
                                                                        int aP2 ,
                                                                        byte aP3 ,
                                                                        String aP4 ,
                                                                        short aP5 ,
                                                                        String aP6 ,
                                                                        String[] aP7 ,
                                                                        byte[] aP8 )
   {
      colorserviceactualizaciondeconsumos.this.aP9 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        short aP5 ,
                        String aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             short aP5 ,
                             String aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP9 )
   {
      colorserviceactualizaciondeconsumos.this.AV24WP_BatchCode = aP0;
      colorserviceactualizaciondeconsumos.this.AV25EmprCod = aP1;
      colorserviceactualizaciondeconsumos.this.AV11Barcod = aP2;
      colorserviceactualizaciondeconsumos.this.AV10Barcodreo = aP3;
      colorserviceactualizaciondeconsumos.this.AV9Barcodpar = aP4;
      colorserviceactualizaciondeconsumos.this.AV8Reclinmaq = aP5;
      colorserviceactualizaciondeconsumos.this.AV28Op = aP6;
      colorserviceactualizaciondeconsumos.this.aP7 = aP7;
      colorserviceactualizaciondeconsumos.this.aP8 = aP8;
      colorserviceactualizaciondeconsumos.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22inc_obs = "" ;
      AV17RecNumAny = (byte)(0) ;
      AV27messages.clear();
      /* Using cursor P09ES2 */
      pr_default.execute(0, new Object[] {AV25EmprCod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV10Barcodreo), AV9Barcodpar, Short.valueOf(AV8Reclinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09ES2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09ES2_A130BarCodPar[0] ;
         A132BarCodReo = P09ES2_A132BarCodReo[0] ;
         A129BarCod = P09ES2_A129BarCod[0] ;
         A396EmprCod = P09ES2_A396EmprCod[0] ;
         A4654RecNroPar = P09ES2_A4654RecNroPar[0] ;
         n4654RecNroPar = P09ES2_n4654RecNroPar[0] ;
         AV12RecNroPar = A4654RecNroPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12RecNroPar == 999999 )
      {
         AV26message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV26message.setgxTv_SdtMessages_Message_Id( localUtil.format( DecimalUtil.doubleToDec(AV12RecNroPar), "ZZZZZ9") );
         AV26message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Esta OS ", "")+localUtil.format( DecimalUtil.doubleToDec(AV11Barcod), "ZZZZZZZ9")+"-"+localUtil.format( DecimalUtil.doubleToDec(AV10Barcodreo), "9")+AV9Barcodpar+httpContext.getMessage( " ya fue actualizada desde F8", "") );
         AV27messages.add(AV26message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P09ES3 */
      pr_colorservice.execute(0, new Object[] {AV24WP_BatchCode});
      while ( (pr_colorservice.getStatus(0) != 101) )
      {
         brk9ES3 = false ;
         A13951WP_BatchCo = P09ES3_A13951WP_BatchCo[0] ;
         A13959WP_ProdBat = P09ES3_A13959WP_ProdBat[0] ;
         A13958WP_Dosed = P09ES3_A13958WP_Dosed[0] ;
         A13960WP_DosingO = P09ES3_A13960WP_DosingO[0] ;
         A13956WP_Product = P09ES3_A13956WP_Product[0] ;
         A13952WP_CallOff = P09ES3_A13952WP_CallOff[0] ;
         A13961WP_StatusC = P09ES3_A13961WP_StatusC[0] ;
         A13948WP_ID = P09ES3_A13948WP_ID[0] ;
         while ( (pr_colorservice.getStatus(0) != 101) && ( GXutil.strcmp(P09ES3_A13951WP_BatchCo[0], A13951WP_BatchCo) == 0 ) && ( P09ES3_A13952WP_CallOff[0] == A13952WP_CallOff ) && ( GXutil.strcmp(P09ES3_A13956WP_Product[0], A13956WP_Product) == 0 ) )
         {
            brk9ES3 = false ;
            A13959WP_ProdBat = P09ES3_A13959WP_ProdBat[0] ;
            A13958WP_Dosed = P09ES3_A13958WP_Dosed[0] ;
            A13960WP_DosingO = P09ES3_A13960WP_DosingO[0] ;
            A13948WP_ID = P09ES3_A13948WP_ID[0] ;
            AV13Dosed = DecimalUtil.ZERO ;
            AV14Lotes = "" ;
            AV15ProdBatchCode = " " ;
            AV16comentario = " " ;
            while ( (pr_colorservice.getStatus(0) != 101) && ( GXutil.strcmp(P09ES3_A13951WP_BatchCo[0], A13951WP_BatchCo) == 0 ) && ( P09ES3_A13952WP_CallOff[0] == A13952WP_CallOff ) && ( GXutil.strcmp(P09ES3_A13956WP_Product[0], A13956WP_Product) == 0 ) )
            {
               brk9ES3 = false ;
               A13959WP_ProdBat = P09ES3_A13959WP_ProdBat[0] ;
               A13958WP_Dosed = P09ES3_A13958WP_Dosed[0] ;
               A13960WP_DosingO = P09ES3_A13960WP_DosingO[0] ;
               A13948WP_ID = P09ES3_A13948WP_ID[0] ;
               if ( GXutil.strcmp(A13959WP_ProdBat, AV15ProdBatchCode) != 0 )
               {
                  if ( (GXutil.strcmp("", AV14Lotes)==0) )
                  {
                     AV14Lotes = GXutil.trim( A13959WP_ProdBat) ;
                  }
                  else
                  {
                     AV14Lotes += " " + GXutil.trim( A13959WP_ProdBat) ;
                  }
               }
               AV13Dosed = AV13Dosed.add(A13958WP_Dosed) ;
               AV15ProdBatchCode = A13959WP_ProdBat ;
               AV16comentario = ((A13960WP_DosingO==0) ? httpContext.getMessage( "Acerto", "") : "") ;
               brk9ES3 = true ;
               pr_colorservice.readNext(0);
            }
            AV18RecForNro = (byte)(A13952WP_CallOff) ;
            AV19ProductCode = A13956WP_Product ;
            AV20Prdcant = AV13Dosed ;
            if ( GXutil.strcmp(AV16comentario, httpContext.getMessage( "Acerto", "")) == 0 )
            {
               /* Execute user subroutine: 'CREARACERTO' */
               S121 ();
               if ( returnInSub )
               {
                  pr_colorservice.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /* Execute user subroutine: 'LRECET' */
               S111 ();
               if ( returnInSub )
               {
                  pr_colorservice.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            if ( ! brk9ES3 )
            {
               brk9ES3 = true ;
               pr_colorservice.readNext(0);
            }
         }
         if ( ! brk9ES3 )
         {
            brk9ES3 = true ;
            pr_colorservice.readNext(0);
         }
      }
      pr_colorservice.close(0);
      /* Using cursor P09ES4 */
      pr_colorservice.execute(1, new Object[] {AV24WP_BatchCode});
      while ( (pr_colorservice.getStatus(1) != 101) )
      {
         A13951WP_BatchCo = P09ES4_A13951WP_BatchCo[0] ;
         A13961WP_StatusC = P09ES4_A13961WP_StatusC[0] ;
         A13956WP_Product = P09ES4_A13956WP_Product[0] ;
         A13952WP_CallOff = P09ES4_A13952WP_CallOff[0] ;
         A13948WP_ID = P09ES4_A13948WP_ID[0] ;
         AV26message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV26message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "tabla ProductWeight", "") );
         AV26message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Actualizo StatusCSv ", "")+localUtil.format( DecimalUtil.doubleToDec(A13961WP_StatusC), "ZZZZ9")+httpContext.getMessage( " por 10", "") );
         AV27messages.add(AV26message, 0);
         A13961WP_StatusC = 10 ;
         /* Using cursor P09ES5 */
         pr_colorservice.execute(2, new Object[] {Integer.valueOf(A13961WP_StatusC), Long.valueOf(A13948WP_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPWeightProduct");
         pr_colorservice.readNext(1);
      }
      pr_colorservice.close(1);
      /* Using cursor P09ES6 */
      pr_default.execute(1, new Object[] {AV25EmprCod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV10Barcodreo), AV9Barcodpar, Short.valueOf(AV8Reclinmaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P09ES6_A2804RecLinMaq[0] ;
         A130BarCodPar = P09ES6_A130BarCodPar[0] ;
         A132BarCodReo = P09ES6_A132BarCodReo[0] ;
         A129BarCod = P09ES6_A129BarCod[0] ;
         A396EmprCod = P09ES6_A396EmprCod[0] ;
         A4654RecNroPar = P09ES6_A4654RecNroPar[0] ;
         n4654RecNroPar = P09ES6_n4654RecNroPar[0] ;
         AV26message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV26message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "tabla BARCAD", "") );
         AV26message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Actualizo ", "")+localUtil.format( DecimalUtil.doubleToDec(A4654RecNroPar), "ZZZZZ9")+httpContext.getMessage( " por 999999", "") );
         AV27messages.add(AV26message, 0);
         A4654RecNroPar = 999999 ;
         n4654RecNroPar = false ;
         /* Using cursor P09ES7 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n4654RecNroPar), Integer.valueOf(A4654RecNroPar), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'LRECET' Routine */
      returnInSub = false ;
      AV21Reclin = (short)(0) ;
      /* Using cursor P09ES8 */
      pr_default.execute(3, new Object[] {AV25EmprCod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV10Barcodreo), AV9Barcodpar, Short.valueOf(AV8Reclinmaq), AV19ProductCode, Byte.valueOf(AV18RecForNro)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A872RecPrdNum = P09ES8_A872RecPrdNum[0] ;
         A2394RecForNro = P09ES8_A2394RecForNro[0] ;
         A2804RecLinMaq = P09ES8_A2804RecLinMaq[0] ;
         A130BarCodPar = P09ES8_A130BarCodPar[0] ;
         A132BarCodReo = P09ES8_A132BarCodReo[0] ;
         A129BarCod = P09ES8_A129BarCod[0] ;
         A396EmprCod = P09ES8_A396EmprCod[0] ;
         A686PrdCant = P09ES8_A686PrdCant[0] ;
         A683PrdCanFin = P09ES8_A683PrdCanFin[0] ;
         A5725RecLote = P09ES8_A5725RecLote[0] ;
         A8937RecAcc = P09ES8_A8937RecAcc[0] ;
         A811RecLin = P09ES8_A811RecLin[0] ;
         A1273RecLinPro = P09ES8_A1273RecLinPro[0] ;
         A683PrdCanFin = A686PrdCant ;
         A686PrdCant = AV13Dosed ;
         A8937RecAcc = A5725RecLote ;
         A5725RecLote = GXutil.trim( GXutil.substring( AV14Lotes, 1, 26)) ;
         AV21Reclin = (short)(1) ;
         AV26message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV26message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "Lrecet.ColServ", "") );
         AV26message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Hdr/#/##/###", "")+GXutil.str( A129BarCod, 8, 0)+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar+"/"+GXutil.str( A2804RecLinMaq, 4, 0)+"/"+GXutil.str( A1273RecLinPro, 2, 0)+"/"+GXutil.str( A811RecLin, 4, 0) );
         AV26message.setgxTv_SdtMessages_Message_Description( AV26message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Prdnum=", "")+A872RecPrdNum+httpContext.getMessage( " Prdcant=", "")+GXutil.str( AV13Dosed, 10, 2)+httpContext.getMessage( " Prdcanfin=", "")+GXutil.str( A683PrdCanFin, 11, 3) );
         AV27messages.add(AV26message, 0);
         AV22inc_obs = httpContext.getMessage( "Hdr/#/##/###", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "/" + GXutil.str( A2804RecLinMaq, 4, 0) + "/" + GXutil.str( A1273RecLinPro, 2, 0) + "/" + GXutil.str( A811RecLin, 4, 0) + GXutil.newLine( ) ;
         AV22inc_obs += httpContext.getMessage( "Prdnum=", "") + A872RecPrdNum + httpContext.getMessage( " Prdcant=", "") + GXutil.str( AV13Dosed, 10, 2) + httpContext.getMessage( " Prdcanfin=", "") + GXutil.str( A683PrdCanFin, 11, 3) ;
         /* Using cursor P09ES9 */
         pr_default.execute(4, new Object[] {A686PrdCant, A683PrdCanFin, A5725RecLote, A8937RecAcc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'CREARACERTO' Routine */
      returnInSub = false ;
      AV38GXLvl130 = (byte)(0) ;
      /* Using cursor P09ES10 */
      pr_default.execute(5, new Object[] {AV25EmprCod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV10Barcodreo), AV9Barcodpar, Short.valueOf(AV8Reclinmaq), AV19ProductCode});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P09ES10_A396EmprCod[0] ;
         A129BarCod = P09ES10_A129BarCod[0] ;
         A132BarCodReo = P09ES10_A132BarCodReo[0] ;
         A130BarCodPar = P09ES10_A130BarCodPar[0] ;
         A2808RecLinMAL = P09ES10_A2808RecLinMAL[0] ;
         A719PrdNum = P09ES10_A719PrdNum[0] ;
         A1377RecNumAny = P09ES10_A1377RecNumAny[0] ;
         AV38GXLvl130 = (byte)(1) ;
         AV17RecNumAny = A1377RecNumAny ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( AV38GXLvl130 == 0 )
      {
         AV17RecNumAny = (byte)(0) ;
      }
      AV17RecNumAny = (byte)(AV17RecNumAny+1) ;
      /*
         INSERT RECORD ON TABLE TXPLANYAD

      */
      A396EmprCod = AV25EmprCod ;
      A129BarCod = AV11Barcod ;
      A132BarCodReo = AV10Barcodreo ;
      A130BarCodPar = AV9Barcodpar ;
      A2808RecLinMAL = AV8Reclinmaq ;
      A1377RecNumAny = AV17RecNumAny ;
      A719PrdNum = GXutil.trim( AV19ProductCode) ;
      A1378PrdCFin = AV13Dosed ;
      n1378PrdCFin = false ;
      A4578LanyUsr = httpContext.getMessage( "ColServ", "") ;
      n4578LanyUsr = false ;
      A4579LanyFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n4579LanyFec = false ;
      A5807LanyLote = GXutil.trim( GXutil.substring( AV14Lotes, 1, 26)) ;
      n5807LanyLote = false ;
      A3381LanyCan = AV13Dosed ;
      n3381LanyCan = false ;
      A12706LanyUnd = "2" ;
      n12706LanyUnd = false ;
      A3382LanyNro = AV18RecForNro ;
      n3382LanyNro = false ;
      /* Using cursor P09ES11 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum, Boolean.valueOf(n1378PrdCFin), A1378PrdCFin, Boolean.valueOf(n3381LanyCan), A3381LanyCan, Boolean.valueOf(n3382LanyNro), Byte.valueOf(A3382LanyNro), Boolean.valueOf(n4578LanyUsr), A4578LanyUsr, Boolean.valueOf(n4579LanyFec), A4579LanyFec, Boolean.valueOf(n5807LanyLote), A5807LanyLote, Boolean.valueOf(n12706LanyUnd), A12706LanyUnd});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
      if ( (pr_default.getStatus(6) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      AV26message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV26message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "LANYAD.ColServ", "") );
      AV26message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Hdr/#/RecNumAny ", "")+GXutil.str( AV11Barcod, 8, 0)+GXutil.str( AV10Barcodreo, 1, 0)+AV9Barcodpar+"/"+GXutil.str( AV8Reclinmaq, 4, 0)+"/"+GXutil.str( AV17RecNumAny, 2, 0) );
      AV26message.setgxTv_SdtMessages_Message_Description( AV26message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "&ProductCode=", "")+AV19ProductCode+httpContext.getMessage( " PrdCFin=", "")+GXutil.str( AV13Dosed, 10, 2)+httpContext.getMessage( " &RecForNro=", "")+GXutil.str( AV18RecForNro, 2, 0) );
      AV27messages.add(AV26message, 0);
   }

   protected void cleanup( )
   {
      this.aP7[0] = colorserviceactualizaciondeconsumos.this.AV22inc_obs;
      this.aP8[0] = colorserviceactualizaciondeconsumos.this.AV17RecNumAny;
      this.aP9[0] = colorserviceactualizaciondeconsumos.this.AV27messages;
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorserviceactualizaciondeconsumos");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22inc_obs = "" ;
      AV27messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P09ES2_A2804RecLinMaq = new short[1] ;
      P09ES2_A130BarCodPar = new String[] {""} ;
      P09ES2_A132BarCodReo = new byte[1] ;
      P09ES2_A129BarCod = new int[1] ;
      P09ES2_A396EmprCod = new String[] {""} ;
      P09ES2_A4654RecNroPar = new int[1] ;
      P09ES2_n4654RecNroPar = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV26message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P09ES3_A13951WP_BatchCo = new String[] {""} ;
      P09ES3_A13959WP_ProdBat = new String[] {""} ;
      P09ES3_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ES3_A13960WP_DosingO = new int[1] ;
      P09ES3_A13956WP_Product = new String[] {""} ;
      P09ES3_A13952WP_CallOff = new int[1] ;
      P09ES3_A13961WP_StatusC = new int[1] ;
      P09ES3_A13948WP_ID = new long[1] ;
      A13951WP_BatchCo = "" ;
      A13959WP_ProdBat = "" ;
      A13958WP_Dosed = DecimalUtil.ZERO ;
      A13956WP_Product = "" ;
      AV13Dosed = DecimalUtil.ZERO ;
      AV14Lotes = "" ;
      AV15ProdBatchCode = "" ;
      AV16comentario = "" ;
      AV19ProductCode = "" ;
      AV20Prdcant = DecimalUtil.ZERO ;
      P09ES4_A13951WP_BatchCo = new String[] {""} ;
      P09ES4_A13961WP_StatusC = new int[1] ;
      P09ES4_A13956WP_Product = new String[] {""} ;
      P09ES4_A13952WP_CallOff = new int[1] ;
      P09ES4_A13948WP_ID = new long[1] ;
      P09ES6_A2804RecLinMaq = new short[1] ;
      P09ES6_A130BarCodPar = new String[] {""} ;
      P09ES6_A132BarCodReo = new byte[1] ;
      P09ES6_A129BarCod = new int[1] ;
      P09ES6_A396EmprCod = new String[] {""} ;
      P09ES6_A4654RecNroPar = new int[1] ;
      P09ES6_n4654RecNroPar = new boolean[] {false} ;
      P09ES8_A872RecPrdNum = new String[] {""} ;
      P09ES8_A2394RecForNro = new byte[1] ;
      P09ES8_A2804RecLinMaq = new short[1] ;
      P09ES8_A130BarCodPar = new String[] {""} ;
      P09ES8_A132BarCodReo = new byte[1] ;
      P09ES8_A129BarCod = new int[1] ;
      P09ES8_A396EmprCod = new String[] {""} ;
      P09ES8_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ES8_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ES8_A5725RecLote = new String[] {""} ;
      P09ES8_A8937RecAcc = new String[] {""} ;
      P09ES8_A811RecLin = new short[1] ;
      P09ES8_A1273RecLinPro = new byte[1] ;
      A872RecPrdNum = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A8937RecAcc = "" ;
      P09ES10_A396EmprCod = new String[] {""} ;
      P09ES10_A129BarCod = new int[1] ;
      P09ES10_A132BarCodReo = new byte[1] ;
      P09ES10_A130BarCodPar = new String[] {""} ;
      P09ES10_A2808RecLinMAL = new short[1] ;
      P09ES10_A719PrdNum = new String[] {""} ;
      P09ES10_A1377RecNumAny = new byte[1] ;
      A719PrdNum = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      A3381LanyCan = DecimalUtil.ZERO ;
      A12706LanyUnd = "" ;
      Gx_emsg = "" ;
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorserviceactualizaciondeconsumos__colorservice(),
         new Object[] {
             new Object[] {
            P09ES3_A13951WP_BatchCo, P09ES3_A13959WP_ProdBat, P09ES3_A13958WP_Dosed, P09ES3_A13960WP_DosingO, P09ES3_A13956WP_Product, P09ES3_A13952WP_CallOff, P09ES3_A13961WP_StatusC, P09ES3_A13948WP_ID
            }
            , new Object[] {
            P09ES4_A13951WP_BatchCo, P09ES4_A13961WP_StatusC, P09ES4_A13956WP_Product, P09ES4_A13952WP_CallOff, P09ES4_A13948WP_ID
            }
            , new Object[] {
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorserviceactualizaciondeconsumos__default(),
         new Object[] {
             new Object[] {
            P09ES2_A2804RecLinMaq, P09ES2_A130BarCodPar, P09ES2_A132BarCodReo, P09ES2_A129BarCod, P09ES2_A396EmprCod, P09ES2_A4654RecNroPar, P09ES2_n4654RecNroPar
            }
            , new Object[] {
            P09ES6_A2804RecLinMaq, P09ES6_A130BarCodPar, P09ES6_A132BarCodReo, P09ES6_A129BarCod, P09ES6_A396EmprCod, P09ES6_A4654RecNroPar, P09ES6_n4654RecNroPar
            }
            , new Object[] {
            }
            , new Object[] {
            P09ES8_A872RecPrdNum, P09ES8_A2394RecForNro, P09ES8_A2804RecLinMaq, P09ES8_A130BarCodPar, P09ES8_A132BarCodReo, P09ES8_A129BarCod, P09ES8_A396EmprCod, P09ES8_A686PrdCant, P09ES8_A683PrdCanFin, P09ES8_A5725RecLote,
            P09ES8_A8937RecAcc, P09ES8_A811RecLin, P09ES8_A1273RecLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            P09ES10_A396EmprCod, P09ES10_A129BarCod, P09ES10_A132BarCodReo, P09ES10_A130BarCodPar, P09ES10_A2808RecLinMAL, P09ES10_A719PrdNum, P09ES10_A1377RecNumAny
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private byte AV17RecNumAny ;
   private byte A132BarCodReo ;
   private byte AV18RecForNro ;
   private byte A2394RecForNro ;
   private byte A1273RecLinPro ;
   private byte A1377RecNumAny ;
   private byte AV38GXLvl130 ;
   private byte A3382LanyNro ;
   private short AV8Reclinmaq ;
   private short A2804RecLinMaq ;
   private short AV21Reclin ;
   private short A811RecLin ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int AV11Barcod ;
   private int A129BarCod ;
   private int A4654RecNroPar ;
   private int AV12RecNroPar ;
   private int A13960WP_DosingO ;
   private int A13952WP_CallOff ;
   private int A13961WP_StatusC ;
   private int GX_INS411 ;
   private long A13948WP_ID ;
   private java.math.BigDecimal A13958WP_Dosed ;
   private java.math.BigDecimal AV13Dosed ;
   private java.math.BigDecimal AV20Prdcant ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A3381LanyCan ;
   private String AV25EmprCod ;
   private String AV9Barcodpar ;
   private String AV28Op ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV14Lotes ;
   private String AV16comentario ;
   private String A872RecPrdNum ;
   private String A5725RecLote ;
   private String A8937RecAcc ;
   private String A719PrdNum ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String A12706LanyUnd ;
   private String Gx_emsg ;
   private java.util.Date A4579LanyFec ;
   private boolean n4654RecNroPar ;
   private boolean returnInSub ;
   private boolean brk9ES3 ;
   private boolean n1378PrdCFin ;
   private boolean n4578LanyUsr ;
   private boolean n4579LanyFec ;
   private boolean n5807LanyLote ;
   private boolean n3381LanyCan ;
   private boolean n12706LanyUnd ;
   private boolean n3382LanyNro ;
   private String AV24WP_BatchCode ;
   private String AV22inc_obs ;
   private String A13951WP_BatchCo ;
   private String A13959WP_ProdBat ;
   private String A13956WP_Product ;
   private String AV15ProdBatchCode ;
   private String AV19ProductCode ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP9 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P09ES2_A2804RecLinMaq ;
   private String[] P09ES2_A130BarCodPar ;
   private byte[] P09ES2_A132BarCodReo ;
   private int[] P09ES2_A129BarCod ;
   private String[] P09ES2_A396EmprCod ;
   private int[] P09ES2_A4654RecNroPar ;
   private boolean[] P09ES2_n4654RecNroPar ;
   private IDataStoreProvider pr_colorservice ;
   private String[] P09ES3_A13951WP_BatchCo ;
   private String[] P09ES3_A13959WP_ProdBat ;
   private java.math.BigDecimal[] P09ES3_A13958WP_Dosed ;
   private int[] P09ES3_A13960WP_DosingO ;
   private String[] P09ES3_A13956WP_Product ;
   private int[] P09ES3_A13952WP_CallOff ;
   private int[] P09ES3_A13961WP_StatusC ;
   private long[] P09ES3_A13948WP_ID ;
   private String[] P09ES4_A13951WP_BatchCo ;
   private int[] P09ES4_A13961WP_StatusC ;
   private String[] P09ES4_A13956WP_Product ;
   private int[] P09ES4_A13952WP_CallOff ;
   private long[] P09ES4_A13948WP_ID ;
   private short[] P09ES6_A2804RecLinMaq ;
   private String[] P09ES6_A130BarCodPar ;
   private byte[] P09ES6_A132BarCodReo ;
   private int[] P09ES6_A129BarCod ;
   private String[] P09ES6_A396EmprCod ;
   private int[] P09ES6_A4654RecNroPar ;
   private boolean[] P09ES6_n4654RecNroPar ;
   private String[] P09ES8_A872RecPrdNum ;
   private byte[] P09ES8_A2394RecForNro ;
   private short[] P09ES8_A2804RecLinMaq ;
   private String[] P09ES8_A130BarCodPar ;
   private byte[] P09ES8_A132BarCodReo ;
   private int[] P09ES8_A129BarCod ;
   private String[] P09ES8_A396EmprCod ;
   private java.math.BigDecimal[] P09ES8_A686PrdCant ;
   private java.math.BigDecimal[] P09ES8_A683PrdCanFin ;
   private String[] P09ES8_A5725RecLote ;
   private String[] P09ES8_A8937RecAcc ;
   private short[] P09ES8_A811RecLin ;
   private byte[] P09ES8_A1273RecLinPro ;
   private String[] P09ES10_A396EmprCod ;
   private int[] P09ES10_A129BarCod ;
   private byte[] P09ES10_A132BarCodReo ;
   private String[] P09ES10_A130BarCodPar ;
   private short[] P09ES10_A2808RecLinMAL ;
   private String[] P09ES10_A719PrdNum ;
   private byte[] P09ES10_A1377RecNumAny ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV27messages ;
   private com.genexus.SdtMessages_Message AV26message ;
}

final  class colorserviceactualizaciondeconsumos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ES3", "SELECT [BatchCode], [ProductBatchCode], [Dosed], [DosingOrigin], [ProductCode], [CallOff], [Status], [id] FROM [TXPWeightProduct] WITH (NOLOCK) WHERE ([BatchCode] = ?) AND ([Status] <> 10) ORDER BY [BatchCode], [CallOff], [ProductCode] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ES4", "SELECT [BatchCode], [Status], [ProductCode], [CallOff], [id] FROM [TXPWeightProduct] WITH (UPDLOCK) WHERE ([BatchCode] = ?) AND ([Status] <> 10) ORDER BY [BatchCode], [CallOff], [ProductCode] ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09ES5", "UPDATE [TXPWeightProduct] SET [Status]=?  WHERE [id] = ?", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class colorserviceactualizaciondeconsumos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ES2", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecNroPar FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09ES6", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecNroPar FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09ES7", "UPDATE TXPRECMAQ SET RecNroPar=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P09ES8", "SELECT RecPrdNum, RecForNro, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, PrdCant, PrdCanFin, RecLote, RecAcc, RecLin, RecLinPro FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (RecPrdNum = RTRIM(LTRIM(?))) AND (RecForNro = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09ES9", "UPDATE TXPLRECET SET PrdCant=?, PrdCanFin=?, RecLote=?, RecAcc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new ForEachCursor("P09ES10", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, PrdNum, RecNumAny FROM TXPLANYAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMAL = ?) AND (PrdNum = RTRIM(LTRIM(?))) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, PrdNum, RecNumAny DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09ES11", "INSERT INTO TXPLANYAD(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum, PrdCFin, LanyCan, LanyNro, LanyUsr, LanyFec, LanyLote, LanyUnd, LanyPrd, LanyTnq, LanyCtd, LanyLoteFc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 30);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 40);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 30);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 3);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 3);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 8);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[16], false);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 26);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[20], 1);
               }
               return;
      }
   }

}

