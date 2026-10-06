package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdevcalpro extends GXProcedure
{
   public pdevcalpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdevcalpro.class ), "" );
   }

   public pdevcalpro( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 )
   {
      pdevcalpro.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pdevcalpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdevcalpro.this.Gx_mode = aP1[0];
      this.aP1 = aP1;
      pdevcalpro.this.AV9Prdnum = aP2[0];
      this.aP2 = aP2;
      pdevcalpro.this.AV10AlbProID = aP3[0];
      this.aP3 = aP3;
      pdevcalpro.this.AV14AlbProdate = aP4[0];
      this.aP4 = aP4;
      pdevcalpro.this.AV20AlbProTipo = aP5[0];
      this.aP5 = aP5;
      pdevcalpro.this.AV23AlbProLinea = aP6[0];
      this.aP6 = aP6;
      pdevcalpro.this.AV11PrvNum = aP7[0];
      this.aP7 = aP7;
      pdevcalpro.this.AV12Cant = aP8[0];
      this.aP8 = aP8;
      pdevcalpro.this.AV13OldCant = aP9[0];
      this.aP9 = aP9;
      pdevcalpro.this.AV31albprolote = aP10[0];
      this.aP10 = aP10;
      pdevcalpro.this.AV21Usurcod = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pdevcalpro.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         AV22AlbDev = GXutil.trim( GXutil.str( AV10AlbProID, 8, 0)) ;
         Gx_msg = httpContext.getMessage( "INS.&prdnum=", "") + AV9Prdnum + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&AlbDev=", "") + AV22AlbDev + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&AlbProLinea=", "") + GXutil.str( AV23AlbProLinea, 4, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&CANT=", "") + GXutil.str( AV12Cant, 9, 2) + GXutil.newLine( ) ;
         /* Using cursor P05ZD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV9Prdnum});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P05ZD2_A719PrdNum[0] ;
            A795PrvNum = P05ZD2_A795PrvNum[0] ;
            A724PrdPreAct = P05ZD2_A724PrdPreAct[0] ;
            A704PrdExiAlm = P05ZD2_A704PrdExiAlm[0] ;
            AV11PrvNum = ((AV11PrvNum==0) ? A795PrvNum : AV11PrvNum) ;
            AV17PrdPreact = A724PrdPreAct ;
            AV19ExiReaAlm = A704PrdExiAlm.subtract(AV12Cant) ;
            AV18PrdExialm = A704PrdExiAlm ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV9Prdnum ;
         GXv_decimal4[0] = AV18PrdExialm ;
         GXv_decimal5[0] = AV19ExiReaAlm ;
         GXv_decimal6[0] = AV12Cant ;
         GXv_int7[0] = (short)(DecimalUtil.decToDouble(AV17PrdPreact)) ;
         new app.pmodex3(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_int7) ;
         pdevcalpro.this.A396EmprCod = GXv_char2[0] ;
         pdevcalpro.this.AV9Prdnum = GXv_char3[0] ;
         pdevcalpro.this.AV18PrdExialm = GXv_decimal4[0] ;
         pdevcalpro.this.AV19ExiReaAlm = GXv_decimal5[0] ;
         pdevcalpro.this.AV12Cant = GXv_decimal6[0] ;
         pdevcalpro.this.AV17PrdPreact = DecimalUtil.doubleToDec(GXv_int7[0]) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = AV9Prdnum ;
         GXv_decimal6[0] = AV12Cant ;
         GXv_date8[0] = AV14AlbProdate ;
         new app.pmodrem(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal6, GXv_date8) ;
         pdevcalpro.this.A396EmprCod = GXv_char3[0] ;
         pdevcalpro.this.AV9Prdnum = GXv_char2[0] ;
         pdevcalpro.this.AV12Cant = GXv_decimal6[0] ;
         pdevcalpro.this.AV14AlbProdate = GXv_date8[0] ;
         AV15TipMovCC = ((GXutil.strcmp(AV20AlbProTipo, "P")==0) ? "SD" : "SP") ;
         AV16CCStkDsc = ((GXutil.strcmp(AV20AlbProTipo, "P")==0) ? "Devolucion Almacen" : "Devolucion Prestamo") ;
         AV22AlbDev = GXutil.trim( GXutil.str( AV10AlbProID, 8, 0)) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = AV9Prdnum ;
         GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal5[0] = AV12Cant ;
         GXv_char9[0] = AV15TipMovCC ;
         GXv_char10[0] = "1" ;
         GXv_decimal4[0] = AV17PrdPreact ;
         GXv_int11[0] = 0 ;
         GXv_int12[0] = (byte)(0) ;
         GXv_char13[0] = " " ;
         GXv_int14[0] = 0 ;
         GXv_char15[0] = AV22AlbDev ;
         GXv_char16[0] = AV21Usurcod ;
         GXv_char17[0] = AV16CCStkDsc ;
         GXv_int7[0] = AV23AlbProLinea ;
         GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal19[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date8[0] = AV14AlbProdate ;
         GXv_int20[0] = AV11PrvNum ;
         GXv_char21[0] = AV31albprolote ;
         new app.stocksquimicos.pnewcc10copy1(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal6, GXv_decimal5, GXv_char9, GXv_char10, GXv_decimal4, GXv_int11, GXv_int12, GXv_char13, GXv_int14, GXv_char15, GXv_char16, GXv_char17, GXv_int7, GXv_decimal18, GXv_decimal19, GXv_date8, GXv_int20, GXv_char21) ;
         pdevcalpro.this.A396EmprCod = GXv_char3[0] ;
         pdevcalpro.this.AV9Prdnum = GXv_char2[0] ;
         pdevcalpro.this.AV12Cant = GXv_decimal5[0] ;
         pdevcalpro.this.AV15TipMovCC = GXv_char9[0] ;
         pdevcalpro.this.AV17PrdPreact = GXv_decimal4[0] ;
         pdevcalpro.this.AV22AlbDev = GXv_char15[0] ;
         pdevcalpro.this.AV21Usurcod = GXv_char16[0] ;
         pdevcalpro.this.AV16CCStkDsc = GXv_char17[0] ;
         pdevcalpro.this.AV23AlbProLinea = GXv_int7[0] ;
         pdevcalpro.this.AV14AlbProdate = GXv_date8[0] ;
         pdevcalpro.this.AV11PrvNum = GXv_int20[0] ;
         pdevcalpro.this.AV31albprolote = GXv_char21[0] ;
         GXv_char21[0] = A396EmprCod ;
         GXv_int20[0] = AV11PrvNum ;
         GXv_date8[0] = AV14AlbProdate ;
         GXv_int14[0] = 0 ;
         GXv_decimal19[0] = AV12Cant ;
         GXv_decimal18[0] = AV17PrdPreact ;
         GXv_char17[0] = "1" ;
         new app.pacespr(remoteHandle, context).execute( GXv_char21, GXv_int20, GXv_date8, GXv_int14, GXv_decimal19, GXv_decimal18, GXv_char17) ;
         pdevcalpro.this.A396EmprCod = GXv_char21[0] ;
         pdevcalpro.this.AV11PrvNum = GXv_int20[0] ;
         pdevcalpro.this.AV14AlbProdate = GXv_date8[0] ;
         pdevcalpro.this.AV12Cant = GXv_decimal19[0] ;
         pdevcalpro.this.AV17PrdPreact = GXv_decimal18[0] ;
         GXv_char21[0] = A396EmprCod ;
         GXv_int20[0] = AV11PrvNum ;
         GXv_char17[0] = AV9Prdnum ;
         GXv_char16[0] = A718PrdNom ;
         GXv_date8[0] = AV14AlbProdate ;
         GXv_int14[0] = 0 ;
         GXv_decimal19[0] = AV12Cant ;
         GXv_decimal18[0] = AV17PrdPreact ;
         GXv_char15[0] = "1" ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char21, GXv_int20, GXv_char17, GXv_char16, GXv_date8, GXv_int14, GXv_decimal19, GXv_decimal18, GXv_char15) ;
         pdevcalpro.this.A396EmprCod = GXv_char21[0] ;
         pdevcalpro.this.AV11PrvNum = GXv_int20[0] ;
         pdevcalpro.this.AV9Prdnum = GXv_char17[0] ;
         pdevcalpro.this.A718PrdNom = GXv_char16[0] ;
         pdevcalpro.this.AV14AlbProdate = GXv_date8[0] ;
         pdevcalpro.this.AV12Cant = GXv_decimal19[0] ;
         pdevcalpro.this.AV17PrdPreact = GXv_decimal18[0] ;
         GXv_char21[0] = A396EmprCod ;
         GXv_char17[0] = AV9Prdnum ;
         GXv_date8[0] = AV14AlbProdate ;
         GXv_decimal19[0] = AV12Cant ;
         GXv_decimal18[0] = AV17PrdPreact ;
         new app.pacespd(remoteHandle, context).execute( GXv_char21, GXv_char17, GXv_date8, GXv_decimal19, GXv_decimal18) ;
         pdevcalpro.this.A396EmprCod = GXv_char21[0] ;
         pdevcalpro.this.AV9Prdnum = GXv_char17[0] ;
         pdevcalpro.this.AV14AlbProdate = GXv_date8[0] ;
         pdevcalpro.this.AV12Cant = GXv_decimal19[0] ;
         pdevcalpro.this.AV17PrdPreact = GXv_decimal18[0] ;
         AV30Inc_obs = Gx_msg ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV37Pgmname, AV21Usurcod, AV29Station, AV30Inc_obs, AV10AlbProID, (byte)(0), " ") ;
      }
      if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
      {
         AV22AlbDev = GXutil.trim( GXutil.str( AV10AlbProID, 8, 0)) ;
         Gx_msg = httpContext.getMessage( "DLT.&prdnum=", "") + AV9Prdnum + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&AlbDev=", "") + AV22AlbDev + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&AlbProLinea=", "") + GXutil.str( AV23AlbProLinea, 4, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&CANT=", "") + GXutil.str( AV12Cant, 9, 2) + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
         AV22AlbDev = GXutil.trim( GXutil.str( AV10AlbProID, 8, 0)) ;
         /* Using cursor P05ZD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV9Prdnum, AV22AlbDev, Short.valueOf(AV23AlbProLinea)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P05ZD3_A719PrdNum[0] ;
            A3354CCStkAlb = P05ZD3_A3354CCStkAlb[0] ;
            A3358CCStkLen = P05ZD3_A3358CCStkLen[0] ;
            A3345TipMovCc = P05ZD3_A3345TipMovCc[0] ;
            A3342CCStkLin = P05ZD3_A3342CCStkLin[0] ;
            A3348CCStkFec = P05ZD3_A3348CCStkFec[0] ;
            A3344CCStkCanS = P05ZD3_A3344CCStkCanS[0] ;
            A3349CCStkPre = P05ZD3_A3349CCStkPre[0] ;
            A5722CCStkLot = P05ZD3_A5722CCStkLot[0] ;
            if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SP", "")) == 0 ) )
            {
               GXv_char21[0] = A396EmprCod ;
               GXv_char17[0] = AV9Prdnum ;
               GXv_int20[0] = AV11PrvNum ;
               GXv_int22[0] = A3342CCStkLin ;
               GXv_date8[0] = A3348CCStkFec ;
               GXv_char16[0] = A3354CCStkAlb ;
               GXv_decimal19[0] = AV12Cant ;
               GXv_decimal18[0] = A3344CCStkCanS ;
               GXv_decimal6[0] = A3349CCStkPre ;
               GXv_decimal5[0] = A3349CCStkPre ;
               GXv_char15[0] = A5722CCStkLot ;
               new app.stocksquimicos.pstm009copy1(remoteHandle, context).execute( GXv_char21, GXv_char17, GXv_int20, GXv_int22, GXv_date8, GXv_char16, GXv_decimal19, GXv_decimal18, GXv_decimal6, GXv_decimal5, GXv_char15) ;
               pdevcalpro.this.A396EmprCod = GXv_char21[0] ;
               pdevcalpro.this.AV9Prdnum = GXv_char17[0] ;
               pdevcalpro.this.AV11PrvNum = GXv_int20[0] ;
               pdevcalpro.this.A3342CCStkLin = GXv_int22[0] ;
               pdevcalpro.this.A3348CCStkFec = GXv_date8[0] ;
               pdevcalpro.this.A3354CCStkAlb = GXv_char16[0] ;
               pdevcalpro.this.AV12Cant = GXv_decimal19[0] ;
               pdevcalpro.this.A3344CCStkCanS = GXv_decimal18[0] ;
               pdevcalpro.this.A3349CCStkPre = GXv_decimal6[0] ;
               pdevcalpro.this.A3349CCStkPre = GXv_decimal5[0] ;
               pdevcalpro.this.A5722CCStkLot = GXv_char15[0] ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV30Inc_obs = Gx_msg ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV37Pgmname, AV21Usurcod, AV29Station, AV30Inc_obs, AV10AlbProID, (byte)(0), " ") ;
      }
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         AV22AlbDev = GXutil.trim( GXutil.str( AV10AlbProID, 8, 0)) ;
         Gx_msg = httpContext.getMessage( "UPD.&prdnum=", "") + AV9Prdnum + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&AlbDev=", "") + AV22AlbDev + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&AlbProLinea=", "") + GXutil.str( AV23AlbProLinea, 4, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&CANT=", "") + GXutil.str( AV12Cant, 9, 2) + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
         /* Using cursor P05ZD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV9Prdnum, AV22AlbDev, Short.valueOf(AV23AlbProLinea)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P05ZD4_A719PrdNum[0] ;
            A3354CCStkAlb = P05ZD4_A3354CCStkAlb[0] ;
            A3358CCStkLen = P05ZD4_A3358CCStkLen[0] ;
            A3345TipMovCc = P05ZD4_A3345TipMovCc[0] ;
            A3342CCStkLin = P05ZD4_A3342CCStkLin[0] ;
            A3348CCStkFec = P05ZD4_A3348CCStkFec[0] ;
            A3344CCStkCanS = P05ZD4_A3344CCStkCanS[0] ;
            A3349CCStkPre = P05ZD4_A3349CCStkPre[0] ;
            A5722CCStkLot = P05ZD4_A5722CCStkLot[0] ;
            GXv_char21[0] = A396EmprCod ;
            GXv_char17[0] = AV9Prdnum ;
            GXv_int20[0] = AV11PrvNum ;
            GXv_int22[0] = A3342CCStkLin ;
            GXv_date8[0] = A3348CCStkFec ;
            GXv_char16[0] = A3354CCStkAlb ;
            GXv_decimal19[0] = AV12Cant ;
            GXv_decimal18[0] = A3344CCStkCanS ;
            GXv_decimal6[0] = A3349CCStkPre ;
            GXv_decimal5[0] = A3349CCStkPre ;
            GXv_char15[0] = A5722CCStkLot ;
            new app.stocksquimicos.pstm009copy1(remoteHandle, context).execute( GXv_char21, GXv_char17, GXv_int20, GXv_int22, GXv_date8, GXv_char16, GXv_decimal19, GXv_decimal18, GXv_decimal6, GXv_decimal5, GXv_char15) ;
            pdevcalpro.this.A396EmprCod = GXv_char21[0] ;
            pdevcalpro.this.AV9Prdnum = GXv_char17[0] ;
            pdevcalpro.this.AV11PrvNum = GXv_int20[0] ;
            pdevcalpro.this.A3342CCStkLin = GXv_int22[0] ;
            pdevcalpro.this.A3348CCStkFec = GXv_date8[0] ;
            pdevcalpro.this.A3354CCStkAlb = GXv_char16[0] ;
            pdevcalpro.this.AV12Cant = GXv_decimal19[0] ;
            pdevcalpro.this.A3344CCStkCanS = GXv_decimal18[0] ;
            pdevcalpro.this.A3349CCStkPre = GXv_decimal6[0] ;
            pdevcalpro.this.A3349CCStkPre = GXv_decimal5[0] ;
            pdevcalpro.this.A5722CCStkLot = GXv_char15[0] ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV30Inc_obs = Gx_msg ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV37Pgmname, AV21Usurcod, AV29Station, AV30Inc_obs, AV10AlbProID, (byte)(0), " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdevcalpro.this.A396EmprCod;
      this.aP1[0] = pdevcalpro.this.Gx_mode;
      this.aP2[0] = pdevcalpro.this.AV9Prdnum;
      this.aP3[0] = pdevcalpro.this.AV10AlbProID;
      this.aP4[0] = pdevcalpro.this.AV14AlbProdate;
      this.aP5[0] = pdevcalpro.this.AV20AlbProTipo;
      this.aP6[0] = pdevcalpro.this.AV23AlbProLinea;
      this.aP7[0] = pdevcalpro.this.AV11PrvNum;
      this.aP8[0] = pdevcalpro.this.AV12Cant;
      this.aP9[0] = pdevcalpro.this.AV13OldCant;
      this.aP10[0] = pdevcalpro.this.AV31albprolote;
      this.aP11[0] = pdevcalpro.this.AV21Usurcod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29Station = "" ;
      GXt_char1 = "" ;
      AV22AlbDev = "" ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P05ZD2_A396EmprCod = new String[] {""} ;
      P05ZD2_A719PrdNum = new String[] {""} ;
      P05ZD2_A795PrvNum = new int[1] ;
      P05ZD2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05ZD2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      AV17PrdPreact = DecimalUtil.ZERO ;
      AV19ExiReaAlm = DecimalUtil.ZERO ;
      AV18PrdExialm = DecimalUtil.ZERO ;
      AV15TipMovCC = "" ;
      AV16CCStkDsc = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int7 = new short[1] ;
      A718PrdNom = "" ;
      GXv_int14 = new int[1] ;
      AV30Inc_obs = "" ;
      AV37Pgmname = "" ;
      P05ZD3_A396EmprCod = new String[] {""} ;
      P05ZD3_A719PrdNum = new String[] {""} ;
      P05ZD3_A3354CCStkAlb = new String[] {""} ;
      P05ZD3_A3358CCStkLen = new short[1] ;
      P05ZD3_A3345TipMovCc = new String[] {""} ;
      P05ZD3_A3342CCStkLin = new long[1] ;
      P05ZD3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05ZD3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05ZD3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05ZD3_A5722CCStkLot = new String[] {""} ;
      A3354CCStkAlb = "" ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      P05ZD4_A396EmprCod = new String[] {""} ;
      P05ZD4_A719PrdNum = new String[] {""} ;
      P05ZD4_A3354CCStkAlb = new String[] {""} ;
      P05ZD4_A3358CCStkLen = new short[1] ;
      P05ZD4_A3345TipMovCc = new String[] {""} ;
      P05ZD4_A3342CCStkLin = new long[1] ;
      P05ZD4_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05ZD4_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05ZD4_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05ZD4_A5722CCStkLot = new String[] {""} ;
      GXv_char21 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int20 = new int[1] ;
      GXv_int22 = new long[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_char16 = new String[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_char15 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdevcalpro__default(),
         new Object[] {
             new Object[] {
            P05ZD2_A396EmprCod, P05ZD2_A719PrdNum, P05ZD2_A795PrvNum, P05ZD2_A724PrdPreAct, P05ZD2_A704PrdExiAlm
            }
            , new Object[] {
            P05ZD3_A396EmprCod, P05ZD3_A719PrdNum, P05ZD3_A3354CCStkAlb, P05ZD3_A3358CCStkLen, P05ZD3_A3345TipMovCc, P05ZD3_A3342CCStkLin, P05ZD3_A3348CCStkFec, P05ZD3_A3344CCStkCanS, P05ZD3_A3349CCStkPre, P05ZD3_A5722CCStkLot
            }
            , new Object[] {
            P05ZD4_A396EmprCod, P05ZD4_A719PrdNum, P05ZD4_A3354CCStkAlb, P05ZD4_A3358CCStkLen, P05ZD4_A3345TipMovCc, P05ZD4_A3342CCStkLin, P05ZD4_A3348CCStkFec, P05ZD4_A3344CCStkCanS, P05ZD4_A3349CCStkPre, P05ZD4_A5722CCStkLot
            }
         }
      );
      AV37Pgmname = "PDevCALPRO" ;
      /* GeneXus formulas. */
      AV37Pgmname = "PDevCALPRO" ;
      Gx_err = (short)(0) ;
   }

   private byte GXv_int12[] ;
   private short AV23AlbProLinea ;
   private short GXv_int7[] ;
   private short A3358CCStkLen ;
   private short Gx_err ;
   private int AV10AlbProID ;
   private int AV11PrvNum ;
   private int A795PrvNum ;
   private int GXv_int11[] ;
   private int GXv_int14[] ;
   private int GXv_int20[] ;
   private long A3342CCStkLin ;
   private long GXv_int22[] ;
   private java.math.BigDecimal AV12Cant ;
   private java.math.BigDecimal AV13OldCant ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV17PrdPreact ;
   private java.math.BigDecimal AV19ExiReaAlm ;
   private java.math.BigDecimal AV18PrdExialm ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV9Prdnum ;
   private String AV20AlbProTipo ;
   private String AV31albprolote ;
   private String AV21Usurcod ;
   private String AV29Station ;
   private String GXt_char1 ;
   private String AV22AlbDev ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String AV15TipMovCC ;
   private String AV16CCStkDsc ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char13[] ;
   private String A718PrdNom ;
   private String AV37Pgmname ;
   private String A3354CCStkAlb ;
   private String A3345TipMovCc ;
   private String A5722CCStkLot ;
   private String GXv_char21[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private java.util.Date AV14AlbProdate ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date GXv_date8[] ;
   private String AV30Inc_obs ;
   private String[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P05ZD2_A396EmprCod ;
   private String[] P05ZD2_A719PrdNum ;
   private int[] P05ZD2_A795PrvNum ;
   private java.math.BigDecimal[] P05ZD2_A724PrdPreAct ;
   private java.math.BigDecimal[] P05ZD2_A704PrdExiAlm ;
   private String[] P05ZD3_A396EmprCod ;
   private String[] P05ZD3_A719PrdNum ;
   private String[] P05ZD3_A3354CCStkAlb ;
   private short[] P05ZD3_A3358CCStkLen ;
   private String[] P05ZD3_A3345TipMovCc ;
   private long[] P05ZD3_A3342CCStkLin ;
   private java.util.Date[] P05ZD3_A3348CCStkFec ;
   private java.math.BigDecimal[] P05ZD3_A3344CCStkCanS ;
   private java.math.BigDecimal[] P05ZD3_A3349CCStkPre ;
   private String[] P05ZD3_A5722CCStkLot ;
   private String[] P05ZD4_A396EmprCod ;
   private String[] P05ZD4_A719PrdNum ;
   private String[] P05ZD4_A3354CCStkAlb ;
   private short[] P05ZD4_A3358CCStkLen ;
   private String[] P05ZD4_A3345TipMovCc ;
   private long[] P05ZD4_A3342CCStkLin ;
   private java.util.Date[] P05ZD4_A3348CCStkFec ;
   private java.math.BigDecimal[] P05ZD4_A3344CCStkCanS ;
   private java.math.BigDecimal[] P05ZD4_A3349CCStkPre ;
   private String[] P05ZD4_A5722CCStkLot ;
}

final  class pdevcalpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05ZD2", "SELECT EmprCod, PrdNum, PrvNum, PrdPreAct, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05ZD3", "SELECT EmprCod, PrdNum, CCStkAlb, CCStkLen, TipMovCc, CCStkLin, CCStkFec, CCStkCanS, CCStkPre, CCStkLot FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkAlb = ? and CCStkLen = ? ORDER BY EmprCod, PrdNum, CCStkAlb, CCStkLen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05ZD4", "SELECT EmprCod, PrdNum, CCStkAlb, CCStkLen, TipMovCc, CCStkLin, CCStkFec, CCStkCanS, CCStkPre, CCStkLot FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkAlb = ? and CCStkLen = ?) AND (TipMovCc = 'SD' or TipMovCc = 'SP') ORDER BY EmprCod, PrdNum, CCStkAlb, CCStkLen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

