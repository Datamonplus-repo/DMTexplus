package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconprew extends GXProcedure
{
   public pconprew( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconprew.class ), "" );
   }

   public pconprew( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           short[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           java.math.BigDecimal[] aP9 ,
                                           String[] aP10 ,
                                           java.math.BigDecimal[] aP11 )
   {
      pconprew.this.aP12 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 )
   {
      pconprew.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pconprew.this.AV13Albprocod = aP1[0];
      this.aP1 = aP1;
      pconprew.this.AV8Barcod = aP2[0];
      this.aP2 = aP2;
      pconprew.this.AV9BarCodreo = aP3[0];
      this.aP3 = aP3;
      pconprew.this.AV10BarCodpar = aP4[0];
      this.aP4 = aP4;
      pconprew.this.AV11Guifaslin = aP5[0];
      this.aP5 = aP5;
      pconprew.this.AV14BarpreKgm = aP6[0];
      this.aP6 = aP6;
      pconprew.this.AV15BarPreMtr = aP7[0];
      this.aP7 = aP7;
      pconprew.this.AV31BarpreUnd = aP8[0];
      this.aP8 = aP8;
      pconprew.this.AV19AlbImpMan = aP9[0];
      this.aP9 = aP9;
      pconprew.this.AV12Tipo_l = aP10[0];
      this.aP10 = aP10;
      pconprew.this.AV20Albprorec = aP11[0];
      this.aP11 = aP11;
      pconprew.this.AV30AlbBarRec = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pconprew.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      pconprew.this.A396EmprCod = GXv_char2[0] ;
      pconprew.this.AV28EmprNom = GXv_char3[0] ;
      pconprew.this.AV29UsurCod = GXv_char4[0] ;
      GXt_int5 = AV18F_tinamar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      pconprew.this.GXt_int5 = GXv_int6[0] ;
      AV18F_tinamar = GXt_int5 ;
      AV32messages.clear();
      if ( GXutil.strcmp(AV12Tipo_l, httpContext.getMessage( "A", "")) == 0 )
      {
         /* Using cursor P02DM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV13Albprocod), Integer.valueOf(AV8Barcod), Byte.valueOf(AV9BarCodreo), AV10BarCodpar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P02DM2_A130BarCodPar[0] ;
            A132BarCodReo = P02DM2_A132BarCodReo[0] ;
            A129BarCod = P02DM2_A129BarCod[0] ;
            A30AlbProCod = P02DM2_A30AlbProCod[0] ;
            A1262BarPreKgm = P02DM2_A1262BarPreKgm[0] ;
            A1264BarPreMtr = P02DM2_A1264BarPreMtr[0] ;
            A12196BarPreUnd = P02DM2_A12196BarPreUnd[0] ;
            A5354AlbImpMan = P02DM2_A5354AlbImpMan[0] ;
            A40AlbProRec = P02DM2_A40AlbProRec[0] ;
            A32AlbProEsp = P02DM2_A32AlbProEsp[0] ;
            A1459BarAlbFor = P02DM2_A1459BarAlbFor[0] ;
            n1459BarAlbFor = P02DM2_n1459BarAlbFor[0] ;
            A1243GuiRemCli = P02DM2_A1243GuiRemCli[0] ;
            A212BarSer = P02DM2_A212BarSer[0] ;
            A135BarColNom = P02DM2_A135BarColNom[0] ;
            A136BarColNum = P02DM2_A136BarColNum[0] ;
            A218BarTipCol = P02DM2_A218BarTipCol[0] ;
            A2761AlbBarRec = P02DM2_A2761AlbBarRec[0] ;
            A212BarSer = P02DM2_A212BarSer[0] ;
            A135BarColNom = P02DM2_A135BarColNom[0] ;
            A136BarColNum = P02DM2_A136BarColNum[0] ;
            A218BarTipCol = P02DM2_A218BarTipCol[0] ;
            A1243GuiRemCli = P02DM2_A1243GuiRemCli[0] ;
            AV33message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV33message.setgxTv_SdtMessages_Message_Id( "0" );
            AV33message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Confirmacion Precios-ALBBAR,Documento ", "")+GXutil.trim( GXutil.str( AV13Albprocod, 10, 0)) );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precios Anteriores:", "") );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Kg= ", "")+GXutil.str( A1262BarPreKgm, 13, 5) );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Mt= ", "")+GXutil.str( A1264BarPreMtr, 13, 5) );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precios Nuevos:", "") );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Kg= ", "")+GXutil.str( AV14BarpreKgm, 13, 5) );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Mt= ", "")+GXutil.str( AV15BarPreMtr, 13, 5) );
            AV32messages.add(AV33message, 0);
            A1262BarPreKgm = AV14BarpreKgm ;
            A1264BarPreMtr = AV15BarPreMtr ;
            A12196BarPreUnd = AV31BarpreUnd ;
            A5354AlbImpMan = AV19AlbImpMan ;
            A40AlbProRec = AV20Albprorec ;
            if ( A32AlbProEsp < 10 )
            {
               A32AlbProEsp = (byte)(A32AlbProEsp+10) ;
            }
            if ( AV18F_tinamar == 1 )
            {
               if ( GXutil.strcmp(A1459BarAlbFor, httpContext.getMessage( "S", "")) != 0 )
               {
                  A1459BarAlbFor = httpContext.getMessage( "S", "") ;
                  n1459BarAlbFor = false ;
               }
            }
            if ( AV18F_tinamar == 1 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_int7[0] = A1243GuiRemCli ;
               GXv_char3[0] = A212BarSer ;
               GXv_char2[0] = A135BarColNom ;
               GXv_int8[0] = A136BarColNum ;
               GXv_int6[0] = A218BarTipCol ;
               GXv_decimal9[0] = AV14BarpreKgm ;
               GXv_decimal10[0] = AV15BarPreMtr ;
               new app.pttx017(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2, GXv_int8, GXv_int6, GXv_decimal9, GXv_decimal10) ;
               pconprew.this.A396EmprCod = GXv_char4[0] ;
               pconprew.this.A1243GuiRemCli = GXv_int7[0] ;
               pconprew.this.A212BarSer = GXv_char3[0] ;
               pconprew.this.A135BarColNom = GXv_char2[0] ;
               pconprew.this.A136BarColNum = GXv_int8[0] ;
               pconprew.this.A218BarTipCol = GXv_int6[0] ;
               pconprew.this.AV14BarpreKgm = GXv_decimal9[0] ;
               pconprew.this.AV15BarPreMtr = GXv_decimal10[0] ;
            }
            A2761AlbBarRec = AV30AlbBarRec ;
            /* Using cursor P02DM3 */
            pr_default.execute(1, new Object[] {A1262BarPreKgm, A1264BarPreMtr, A12196BarPreUnd, A5354AlbImpMan, A40AlbProRec, Byte.valueOf(A32AlbProEsp), Boolean.valueOf(n1459BarAlbFor), A1459BarAlbFor, A2761AlbBarRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV32messages.size() > 0 )
         {
            AV34json = AV32messages.toJSonString(false) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV29UsurCod, AV27Station, AV34json, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
      }
      if ( GXutil.strcmp(AV12Tipo_l, httpContext.getMessage( "F", "")) == 0 )
      {
         /* Using cursor P02DM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV13Albprocod), Integer.valueOf(AV8Barcod), Byte.valueOf(AV9BarCodreo), AV10BarCodpar, Short.valueOf(AV11Guifaslin)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1240GuiFasLin = P02DM4_A1240GuiFasLin[0] ;
            A130BarCodPar = P02DM4_A130BarCodPar[0] ;
            A132BarCodReo = P02DM4_A132BarCodReo[0] ;
            A129BarCod = P02DM4_A129BarCod[0] ;
            A30AlbProCod = P02DM4_A30AlbProCod[0] ;
            A460FasDsc = P02DM4_A460FasDsc[0] ;
            A457FasCod = P02DM4_A457FasCod[0] ;
            A1241GuiFasPKg = P02DM4_A1241GuiFasPKg[0] ;
            A1242GuiFasPMt = P02DM4_A1242GuiFasPMt[0] ;
            A12194FasPreUnd = P02DM4_A12194FasPreUnd[0] ;
            A7752GuiFasRec = P02DM4_A7752GuiFasRec[0] ;
            n7752GuiFasRec = P02DM4_n7752GuiFasRec[0] ;
            A460FasDsc = P02DM4_A460FasDsc[0] ;
            AV33message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV33message.setgxTv_SdtMessages_Message_Id( "0" );
            AV33message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Confirmacion Precios-ALBFAS, Documento ", "")+GXutil.trim( GXutil.str( AV13Albprocod, 10, 0)) );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+A457FasCod+" "+A460FasDsc );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precios Anteriores:", "") );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Kg= ", "")+GXutil.str( A1241GuiFasPKg, 13, 5) );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Mt= ", "")+GXutil.str( A1242GuiFasPMt, 13, 5) );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precios Nuevos:", "") );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Kg= ", "")+GXutil.str( AV14BarpreKgm, 13, 5) );
            AV33message.setgxTv_SdtMessages_Message_Description( AV33message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Precio Mt= ", "")+GXutil.str( AV15BarPreMtr, 13, 5) );
            AV32messages.add(AV33message, 0);
            A1241GuiFasPKg = AV14BarpreKgm ;
            A1242GuiFasPMt = AV15BarPreMtr ;
            A12194FasPreUnd = AV31BarpreUnd ;
            A7752GuiFasRec = AV30AlbBarRec ;
            n7752GuiFasRec = false ;
            /* Using cursor P02DM5 */
            pr_default.execute(3, new Object[] {A1241GuiFasPKg, A1242GuiFasPMt, A12194FasPreUnd, Boolean.valueOf(n7752GuiFasRec), A7752GuiFasRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV32messages.size() > 0 )
         {
            AV34json = AV32messages.toJSonString(false) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV29UsurCod, AV27Station, AV34json, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pconprew.this.A396EmprCod;
      this.aP1[0] = pconprew.this.AV13Albprocod;
      this.aP2[0] = pconprew.this.AV8Barcod;
      this.aP3[0] = pconprew.this.AV9BarCodreo;
      this.aP4[0] = pconprew.this.AV10BarCodpar;
      this.aP5[0] = pconprew.this.AV11Guifaslin;
      this.aP6[0] = pconprew.this.AV14BarpreKgm;
      this.aP7[0] = pconprew.this.AV15BarPreMtr;
      this.aP8[0] = pconprew.this.AV31BarpreUnd;
      this.aP9[0] = pconprew.this.AV19AlbImpMan;
      this.aP10[0] = pconprew.this.AV12Tipo_l;
      this.aP11[0] = pconprew.this.AV20Albprorec;
      this.aP12[0] = pconprew.this.AV30AlbBarRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pconprew");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Station = "" ;
      GXt_char1 = "" ;
      AV28EmprNom = "" ;
      AV29UsurCod = "" ;
      AV32messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P02DM2_A396EmprCod = new String[] {""} ;
      P02DM2_A130BarCodPar = new String[] {""} ;
      P02DM2_A132BarCodReo = new byte[1] ;
      P02DM2_A129BarCod = new int[1] ;
      P02DM2_A30AlbProCod = new long[1] ;
      P02DM2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM2_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM2_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM2_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM2_A32AlbProEsp = new byte[1] ;
      P02DM2_A1459BarAlbFor = new String[] {""} ;
      P02DM2_n1459BarAlbFor = new boolean[] {false} ;
      P02DM2_A1243GuiRemCli = new int[1] ;
      P02DM2_A212BarSer = new String[] {""} ;
      P02DM2_A135BarColNom = new String[] {""} ;
      P02DM2_A136BarColNum = new int[1] ;
      P02DM2_A218BarTipCol = new byte[1] ;
      P02DM2_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A1459BarAlbFor = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      AV33message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV34json = "" ;
      AV38Pgmname = "" ;
      P02DM4_A396EmprCod = new String[] {""} ;
      P02DM4_A1240GuiFasLin = new short[1] ;
      P02DM4_A130BarCodPar = new String[] {""} ;
      P02DM4_A132BarCodReo = new byte[1] ;
      P02DM4_A129BarCod = new int[1] ;
      P02DM4_A30AlbProCod = new long[1] ;
      P02DM4_A460FasDsc = new String[] {""} ;
      P02DM4_A457FasCod = new String[] {""} ;
      P02DM4_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM4_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM4_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DM4_n7752GuiFasRec = new boolean[] {false} ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pconprew__default(),
         new Object[] {
             new Object[] {
            P02DM2_A396EmprCod, P02DM2_A130BarCodPar, P02DM2_A132BarCodReo, P02DM2_A129BarCod, P02DM2_A30AlbProCod, P02DM2_A1262BarPreKgm, P02DM2_A1264BarPreMtr, P02DM2_A12196BarPreUnd, P02DM2_A5354AlbImpMan, P02DM2_A40AlbProRec,
            P02DM2_A32AlbProEsp, P02DM2_A1459BarAlbFor, P02DM2_n1459BarAlbFor, P02DM2_A1243GuiRemCli, P02DM2_A212BarSer, P02DM2_A135BarColNom, P02DM2_A136BarColNum, P02DM2_A218BarTipCol, P02DM2_A2761AlbBarRec
            }
            , new Object[] {
            }
            , new Object[] {
            P02DM4_A396EmprCod, P02DM4_A1240GuiFasLin, P02DM4_A130BarCodPar, P02DM4_A132BarCodReo, P02DM4_A129BarCod, P02DM4_A30AlbProCod, P02DM4_A460FasDsc, P02DM4_A457FasCod, P02DM4_A1241GuiFasPKg, P02DM4_A1242GuiFasPMt,
            P02DM4_A12194FasPreUnd, P02DM4_A7752GuiFasRec, P02DM4_n7752GuiFasRec
            }
            , new Object[] {
            }
         }
      );
      AV38Pgmname = "PCONPREW" ;
      /* GeneXus formulas. */
      AV38Pgmname = "PCONPREW" ;
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodreo ;
   private byte AV18F_tinamar ;
   private byte GXt_int5 ;
   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte A218BarTipCol ;
   private byte GXv_int6[] ;
   private short AV11Guifaslin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A129BarCod ;
   private int A1243GuiRemCli ;
   private int A136BarColNum ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private long AV13Albprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV14BarpreKgm ;
   private java.math.BigDecimal AV15BarPreMtr ;
   private java.math.BigDecimal AV31BarpreUnd ;
   private java.math.BigDecimal AV19AlbImpMan ;
   private java.math.BigDecimal AV20Albprorec ;
   private java.math.BigDecimal AV30AlbBarRec ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private String A396EmprCod ;
   private String AV10BarCodpar ;
   private String AV12Tipo_l ;
   private String AV27Station ;
   private String GXt_char1 ;
   private String AV28EmprNom ;
   private String AV29UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A1459BarAlbFor ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV38Pgmname ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private boolean n1459BarAlbFor ;
   private boolean n7752GuiFasRec ;
   private String AV34json ;
   private java.math.BigDecimal[] aP12 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P02DM2_A396EmprCod ;
   private String[] P02DM2_A130BarCodPar ;
   private byte[] P02DM2_A132BarCodReo ;
   private int[] P02DM2_A129BarCod ;
   private long[] P02DM2_A30AlbProCod ;
   private java.math.BigDecimal[] P02DM2_A1262BarPreKgm ;
   private java.math.BigDecimal[] P02DM2_A1264BarPreMtr ;
   private java.math.BigDecimal[] P02DM2_A12196BarPreUnd ;
   private java.math.BigDecimal[] P02DM2_A5354AlbImpMan ;
   private java.math.BigDecimal[] P02DM2_A40AlbProRec ;
   private byte[] P02DM2_A32AlbProEsp ;
   private String[] P02DM2_A1459BarAlbFor ;
   private boolean[] P02DM2_n1459BarAlbFor ;
   private int[] P02DM2_A1243GuiRemCli ;
   private String[] P02DM2_A212BarSer ;
   private String[] P02DM2_A135BarColNom ;
   private int[] P02DM2_A136BarColNum ;
   private byte[] P02DM2_A218BarTipCol ;
   private java.math.BigDecimal[] P02DM2_A2761AlbBarRec ;
   private String[] P02DM4_A396EmprCod ;
   private short[] P02DM4_A1240GuiFasLin ;
   private String[] P02DM4_A130BarCodPar ;
   private byte[] P02DM4_A132BarCodReo ;
   private int[] P02DM4_A129BarCod ;
   private long[] P02DM4_A30AlbProCod ;
   private String[] P02DM4_A460FasDsc ;
   private String[] P02DM4_A457FasCod ;
   private java.math.BigDecimal[] P02DM4_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P02DM4_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P02DM4_A12194FasPreUnd ;
   private java.math.BigDecimal[] P02DM4_A7752GuiFasRec ;
   private boolean[] P02DM4_n7752GuiFasRec ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV32messages ;
   private com.genexus.SdtMessages_Message AV33message ;
}

final  class pconprew__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DM2", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.BarPreKgm, T1.BarPreMtr, T1.BarPreUnd, T1.AlbImpMan, T1.AlbProRec, T1.AlbProEsp, T1.BarAlbFor, T3.GuiRemCli, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.AlbBarRec FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02DM3", "UPDATE TXPALBBAR SET BarPreKgm=?, BarPreMtr=?, BarPreUnd=?, AlbImpMan=?, AlbProRec=?, AlbProEsp=?, BarAlbFor=?, AlbBarRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P02DM4", "SELECT T1.EmprCod, T1.GuiFasLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.FasDsc, T1.FasCod, T1.GuiFasPKg, T1.GuiFasPMt, T1.FasPreUnd, T1.GuiFasRec FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.GuiFasLin = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02DM5", "UPDATE TXPALBFAS SET GuiFasPKg=?, GuiFasPMt=?, FasPreUnd=?, GuiFasRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 1);
               }
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(9, (String)parms[9], 3);
               stmt.setLong(10, ((Number) parms[10]).longValue());
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setString(13, (String)parms[13], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setLong(6, ((Number) parms[6]).longValue());
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 1);
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               return;
      }
   }

}

