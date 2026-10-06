package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasquia extends GXProcedure
{
   public pfasquia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasquia.class ), "" );
   }

   public pfasquia( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pfasquia.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pfasquia.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasquia.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasquia.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasquia.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasquia.this.AV28ProCodP = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV30Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pfasquia.this.GXt_char1 = GXv_char2[0] ;
      AV30Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV31EmprNom ;
      GXv_char4[0] = AV32UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      pfasquia.this.A396EmprCod = GXv_char2[0] ;
      pfasquia.this.AV31EmprNom = GXv_char3[0] ;
      pfasquia.this.AV32UsurCod = GXv_char4[0] ;
      System.out.println( httpContext.getMessage( "PFASQUIa. Inicio DELETE...", "") );
      /* Using cursor P02K12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5371FasQuiLin = P02K12_A5371FasQuiLin[0] ;
         A194BarOrdLin = P02K12_A194BarOrdLin[0] ;
         A758ProCod = P02K12_A758ProCod[0] ;
         AV33Inc_obs = httpContext.getMessage( "PFASQUIa.Eliminacion FASQUI", "") + GXutil.newLine( ) ;
         AV33Inc_obs += httpContext.getMessage( "Procod=", "") + GXutil.trim( A758ProCod) + GXutil.newLine( ) ;
         AV33Inc_obs += httpContext.getMessage( "Orden =", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
         AV33Inc_obs += httpContext.getMessage( "Linea =", "") + GXutil.str( A5371FasQuiLin, 4, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV37Pgmname, AV32UsurCod, AV30Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P02K13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "PFASQUIa. Fin DELETE...", "") );
      AV24FasForLin = (short)(10) ;
      System.out.println( httpContext.getMessage( "PFASQUIa. Inicio Creo FASQUI...", "") );
      /* Using cursor P02K14 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A758ProCod = P02K14_A758ProCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /* Using cursor P02K15 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4905BarFasAcab = P02K15_A4905BarFasAcab[0] ;
            A457FasCod = P02K15_A457FasCod[0] ;
            A5372FasQuiUl = P02K15_A5372FasQuiUl[0] ;
            n5372FasQuiUl = P02K15_n5372FasQuiUl[0] ;
            A194BarOrdLin = P02K15_A194BarOrdLin[0] ;
            if ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 )
            {
               W396EmprCod = A396EmprCod ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               W758ProCod = A758ProCod ;
               AV8BarCod = A129BarCod ;
               AV9BarCodReo = A132BarCodReo ;
               AV10BarCodPar = A130BarCodPar ;
               AV11ProCod = A758ProCod ;
               AV12EmprCod = A396EmprCod ;
               AV13BarOrdLin = A194BarOrdLin ;
               AV17FasCod = A457FasCod ;
               /* Execute user subroutine: 'FASPR1' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /*
                  INSERT RECORD ON TABLE TXPFASQUI

               */
               W396EmprCod = A396EmprCod ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               W758ProCod = A758ProCod ;
               W194BarOrdLin = A194BarOrdLin ;
               A396EmprCod = AV12EmprCod ;
               A129BarCod = AV8BarCod ;
               A132BarCodReo = AV9BarCodReo ;
               A130BarCodPar = AV10BarCodPar ;
               A758ProCod = AV11ProCod ;
               A194BarOrdLin = AV13BarOrdLin ;
               A5371FasQuiLin = AV24FasForLin ;
               A764ProForCod = AV26Proforcod ;
               A5373FasQuiNp = (short)(0) ;
               A5374FasQuiTp = (short)(0) ;
               A5375FasQuiRb = (short)(0) ;
               A6599FasMaqPl = GXutil.space( (short)(6)) ;
               A6600FasFecPl = GXutil.nullDate() ;
               A6601FasOrdPl = (byte)(0) ;
               A6602FasStPl = (byte)(0) ;
               /* Using cursor P02K16 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
               if ( (pr_default.getStatus(4) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               A758ProCod = W758ProCod ;
               A194BarOrdLin = W194BarOrdLin ;
               /* End Insert */
               AV24FasForLin = (short)(AV24FasForLin+10) ;
               A5372FasQuiUl = (short)(AV24FasForLin-10) ;
               n5372FasQuiUl = false ;
               /* Using cursor P02K17 */
               pr_default.execute(5, new Object[] {Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               A396EmprCod = W396EmprCod ;
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               A758ProCod = W758ProCod ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      System.out.println( httpContext.getMessage( "PFASQUIa. Fin Creo FASQUI...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'SIFASQUI' Routine */
      returnInSub = false ;
      AV27Fasqui = (byte)(0) ;
      /* Using cursor P02K18 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, AV11ProCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A758ProCod = P02K18_A758ProCod[0] ;
         A5371FasQuiLin = P02K18_A5371FasQuiLin[0] ;
         A194BarOrdLin = P02K18_A194BarOrdLin[0] ;
         AV27Fasqui = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S121( )
   {
      /* 'FASPR1' Routine */
      returnInSub = false ;
      AV26Proforcod = "XXXXXX" ;
      /* Using cursor P02K19 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV17FasCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A457FasCod = P02K19_A457FasCod[0] ;
         A764ProForCod = P02K19_A764ProForCod[0] ;
         A4650FasForLin = P02K19_A4650FasForLin[0] ;
         AV26Proforcod = A764ProForCod ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S131( )
   {
      /* 'CREO_FASQUI' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasquia.this.A396EmprCod;
      this.aP1[0] = pfasquia.this.A129BarCod;
      this.aP2[0] = pfasquia.this.A132BarCodReo;
      this.aP3[0] = pfasquia.this.A130BarCodPar;
      this.aP4[0] = pfasquia.this.AV28ProCodP;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfasquia");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV31EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV32UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P02K12_A396EmprCod = new String[] {""} ;
      P02K12_A129BarCod = new int[1] ;
      P02K12_A132BarCodReo = new byte[1] ;
      P02K12_A130BarCodPar = new String[] {""} ;
      P02K12_A5371FasQuiLin = new short[1] ;
      P02K12_A194BarOrdLin = new short[1] ;
      P02K12_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV33Inc_obs = "" ;
      AV37Pgmname = "" ;
      P02K14_A396EmprCod = new String[] {""} ;
      P02K14_A129BarCod = new int[1] ;
      P02K14_A132BarCodReo = new byte[1] ;
      P02K14_A130BarCodPar = new String[] {""} ;
      P02K14_A758ProCod = new String[] {""} ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      P02K15_A396EmprCod = new String[] {""} ;
      P02K15_A129BarCod = new int[1] ;
      P02K15_A132BarCodReo = new byte[1] ;
      P02K15_A130BarCodPar = new String[] {""} ;
      P02K15_A758ProCod = new String[] {""} ;
      P02K15_A4905BarFasAcab = new String[] {""} ;
      P02K15_A457FasCod = new String[] {""} ;
      P02K15_A5372FasQuiUl = new short[1] ;
      P02K15_n5372FasQuiUl = new boolean[] {false} ;
      P02K15_A194BarOrdLin = new short[1] ;
      A4905BarFasAcab = "" ;
      A457FasCod = "" ;
      W758ProCod = "" ;
      AV10BarCodPar = "" ;
      AV11ProCod = "" ;
      AV12EmprCod = "" ;
      AV17FasCod = "" ;
      A764ProForCod = "" ;
      AV26Proforcod = "" ;
      A6599FasMaqPl = "" ;
      A6600FasFecPl = GXutil.nullDate() ;
      AV29FasFecPl = GXutil.nullDate() ;
      Gx_emsg = "" ;
      P02K18_A396EmprCod = new String[] {""} ;
      P02K18_A758ProCod = new String[] {""} ;
      P02K18_A130BarCodPar = new String[] {""} ;
      P02K18_A132BarCodReo = new byte[1] ;
      P02K18_A129BarCod = new int[1] ;
      P02K18_A5371FasQuiLin = new short[1] ;
      P02K18_A194BarOrdLin = new short[1] ;
      P02K19_A396EmprCod = new String[] {""} ;
      P02K19_A457FasCod = new String[] {""} ;
      P02K19_A764ProForCod = new String[] {""} ;
      P02K19_A4650FasForLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasquia__default(),
         new Object[] {
             new Object[] {
            P02K12_A396EmprCod, P02K12_A129BarCod, P02K12_A132BarCodReo, P02K12_A130BarCodPar, P02K12_A5371FasQuiLin, P02K12_A194BarOrdLin, P02K12_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02K14_A396EmprCod, P02K14_A129BarCod, P02K14_A132BarCodReo, P02K14_A130BarCodPar, P02K14_A758ProCod
            }
            , new Object[] {
            P02K15_A396EmprCod, P02K15_A129BarCod, P02K15_A132BarCodReo, P02K15_A130BarCodPar, P02K15_A758ProCod, P02K15_A4905BarFasAcab, P02K15_A457FasCod, P02K15_A5372FasQuiUl, P02K15_n5372FasQuiUl, P02K15_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02K18_A396EmprCod, P02K18_A758ProCod, P02K18_A130BarCodPar, P02K18_A132BarCodReo, P02K18_A129BarCod, P02K18_A5371FasQuiLin, P02K18_A194BarOrdLin
            }
            , new Object[] {
            P02K19_A396EmprCod, P02K19_A457FasCod, P02K19_A764ProForCod, P02K19_A4650FasForLin
            }
         }
      );
      AV37Pgmname = "PFASQUIa" ;
      /* GeneXus formulas. */
      AV37Pgmname = "PFASQUIa" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private byte AV9BarCodReo ;
   private byte A6601FasOrdPl ;
   private byte A6602FasStPl ;
   private byte AV27Fasqui ;
   private short A5371FasQuiLin ;
   private short A194BarOrdLin ;
   private short AV24FasForLin ;
   private short A5372FasQuiUl ;
   private short AV13BarOrdLin ;
   private short W194BarOrdLin ;
   private short A5373FasQuiNp ;
   private short A5374FasQuiTp ;
   private short A5375FasQuiRb ;
   private short Gx_err ;
   private short A4650FasForLin ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int AV8BarCod ;
   private int GX_INS779 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV28ProCodP ;
   private String AV30Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV31EmprNom ;
   private String GXv_char3[] ;
   private String AV32UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String AV37Pgmname ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A4905BarFasAcab ;
   private String A457FasCod ;
   private String W758ProCod ;
   private String AV10BarCodPar ;
   private String AV11ProCod ;
   private String AV12EmprCod ;
   private String AV17FasCod ;
   private String A764ProForCod ;
   private String AV26Proforcod ;
   private String A6599FasMaqPl ;
   private String Gx_emsg ;
   private java.util.Date A6600FasFecPl ;
   private java.util.Date AV29FasFecPl ;
   private boolean n5372FasQuiUl ;
   private boolean returnInSub ;
   private String AV33Inc_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02K12_A396EmprCod ;
   private int[] P02K12_A129BarCod ;
   private byte[] P02K12_A132BarCodReo ;
   private String[] P02K12_A130BarCodPar ;
   private short[] P02K12_A5371FasQuiLin ;
   private short[] P02K12_A194BarOrdLin ;
   private String[] P02K12_A758ProCod ;
   private String[] P02K14_A396EmprCod ;
   private int[] P02K14_A129BarCod ;
   private byte[] P02K14_A132BarCodReo ;
   private String[] P02K14_A130BarCodPar ;
   private String[] P02K14_A758ProCod ;
   private String[] P02K15_A396EmprCod ;
   private int[] P02K15_A129BarCod ;
   private byte[] P02K15_A132BarCodReo ;
   private String[] P02K15_A130BarCodPar ;
   private String[] P02K15_A758ProCod ;
   private String[] P02K15_A4905BarFasAcab ;
   private String[] P02K15_A457FasCod ;
   private short[] P02K15_A5372FasQuiUl ;
   private boolean[] P02K15_n5372FasQuiUl ;
   private short[] P02K15_A194BarOrdLin ;
   private String[] P02K18_A396EmprCod ;
   private String[] P02K18_A758ProCod ;
   private String[] P02K18_A130BarCodPar ;
   private byte[] P02K18_A132BarCodReo ;
   private int[] P02K18_A129BarCod ;
   private short[] P02K18_A5371FasQuiLin ;
   private short[] P02K18_A194BarOrdLin ;
   private String[] P02K19_A396EmprCod ;
   private String[] P02K19_A457FasCod ;
   private String[] P02K19_A764ProForCod ;
   private short[] P02K19_A4650FasForLin ;
}

final  class pfasquia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02K12", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasQuiLin, BarOrdLin, ProCod FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02K13", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P02K14", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02K15", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarFasAcab, FasCod, FasQuiUl, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02K16", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new UpdateCursor("P02K17", "UPDATE TXPBARFAS SET FasQuiUl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P02K18", "SELECT * FROM (SELECT EmprCod, ProCod, BarCodPar, BarCodReo, BarCod, FasQuiLin, BarOrdLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02K19", "SELECT EmprCod, FasCod, ProForCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

