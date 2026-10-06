package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqasignar extends GXProcedure
{
   public pmaqasignar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqasignar.class ), "" );
   }

   public pmaqasignar( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pmaqasignar.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pmaqasignar.this.AV12emprcod = aP0[0];
      this.aP0 = aP0;
      pmaqasignar.this.AV11barcod = aP1[0];
      this.aP1 = aP1;
      pmaqasignar.this.AV10barcodreo = aP2[0];
      this.aP2 = aP2;
      pmaqasignar.this.AV9barcodpar = aP3[0];
      this.aP3 = aP3;
      pmaqasignar.this.AV8Maqcod = aP4[0];
      this.aP4 = aP4;
      pmaqasignar.this.AV13Usurcod = aP5[0];
      this.aP5 = aP5;
      pmaqasignar.this.AV14station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18BarPritin = (byte)(0) ;
      /* Using cursor P05UA2 */
      pr_default.execute(0, new Object[] {AV12emprcod, AV8Maqcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05UA2_A396EmprCod[0] ;
         A180BarMaqCod = P05UA2_A180BarMaqCod[0] ;
         A3594BarPriTin = P05UA2_A3594BarPriTin[0] ;
         A213BarSit = P05UA2_A213BarSit[0] ;
         A129BarCod = P05UA2_A129BarCod[0] ;
         A132BarCodReo = P05UA2_A132BarCodReo[0] ;
         A130BarCodPar = P05UA2_A130BarCodPar[0] ;
         A120BarAgrEst = P05UA2_A120BarAgrEst[0] ;
         AV16Barcodm = A129BarCod ;
         AV17Barcodreom = A132BarCodReo ;
         AV19Barcodparm = A130BarCodPar ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV16Barcodm, AV17Barcodreom, AV19Barcodparm) ;
            if ( ( A129BarCod == AV16Barcodm ) && ( A132BarCodReo == AV17Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV19Barcodparm) == 0 ) )
            {
               AV25Op = "*" ;
            }
         }
         else
         {
            AV25Op = "*" ;
         }
         if ( GXutil.strcmp(AV25Op, "*") == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int5[0] = AV20BarFasEst ;
            GXv_date6[0] = AV21fecha ;
            GXv_char7[0] = " " ;
            new app.pplat07(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_date6, GXv_char7) ;
            pmaqasignar.this.A396EmprCod = GXv_char1[0] ;
            pmaqasignar.this.A129BarCod = GXv_int2[0] ;
            pmaqasignar.this.A132BarCodReo = GXv_int3[0] ;
            pmaqasignar.this.A130BarCodPar = GXv_char4[0] ;
            pmaqasignar.this.AV20BarFasEst = GXv_int5[0] ;
            pmaqasignar.this.AV21fecha = GXv_date6[0] ;
            if ( AV20BarFasEst < 2 )
            {
               AV18BarPritin = A3594BarPriTin ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P05UA3 */
      pr_default.execute(1, new Object[] {AV12emprcod, Integer.valueOf(AV11barcod), Byte.valueOf(AV10barcodreo), AV9barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P05UA3_A130BarCodPar[0] ;
         A132BarCodReo = P05UA3_A132BarCodReo[0] ;
         A129BarCod = P05UA3_A129BarCod[0] ;
         A396EmprCod = P05UA3_A396EmprCod[0] ;
         A180BarMaqCod = P05UA3_A180BarMaqCod[0] ;
         A3594BarPriTin = P05UA3_A3594BarPriTin[0] ;
         A213BarSit = P05UA3_A213BarSit[0] ;
         A120BarAgrEst = P05UA3_A120BarAgrEst[0] ;
         AV18BarPritin = (byte)(((AV18BarPritin>0) ? AV18BarPritin+1 : 80)) ;
         AV15Inc_obs = httpContext.getMessage( "BARCAD.Insert Maquina ", "") + A180BarMaqCod + httpContext.getMessage( " por ", "") + AV8Maqcod + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "PP  ", "") + GXutil.str( A3594BarPriTin, 2, 0) + httpContext.getMessage( " por ", "") + GXutil.str( AV18BarPritin, 2, 0) + GXutil.newLine( ) ;
         if ( A213BarSit == 5 )
         {
            AV15Inc_obs += httpContext.getMessage( "BarSit ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( " por 1", "") + GXutil.newLine( ) ;
         }
         A213BarSit = (byte)(((A213BarSit==5) ? 1 : A213BarSit)) ;
         A180BarMaqCod = AV8Maqcod ;
         A3594BarPriTin = AV18BarPritin ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV27Pgmname, 1, 10), AV13Usurcod, AV14station, AV15Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P05UA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A150BarFacTin = P05UA4_A150BarFacTin[0] ;
            A603MaqCodBis = P05UA4_A603MaqCodBis[0] ;
            A194BarOrdLin = P05UA4_A194BarOrdLin[0] ;
            A153BarFasEst = P05UA4_A153BarFasEst[0] ;
            A758ProCod = P05UA4_A758ProCod[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV15Inc_obs = httpContext.getMessage( "BARFAS.UPD Maquina ", "") + A603MaqCodBis + httpContext.getMessage( " por ", "") + AV8Maqcod + GXutil.newLine( ) ;
               AV15Inc_obs += httpContext.getMessage( "Orden ", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
               A603MaqCodBis = ((A153BarFasEst==0) ? AV8Maqcod : A603MaqCodBis) ;
               if ( A153BarFasEst == 0 )
               {
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV27Pgmname, 1, 10), AV13Usurcod, AV14station, AV15Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               }
               /* Using cursor P05UA5 */
               pr_default.execute(3, new Object[] {A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P05UA6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A119BarAgrCod = P05UA6_A119BarAgrCod[0] ;
               A124BarAgrReo = P05UA6_A124BarAgrReo[0] ;
               A122BarAgrPar = P05UA6_A122BarAgrPar[0] ;
               GXv_char7[0] = A396EmprCod ;
               GXv_int2[0] = A119BarAgrCod ;
               GXv_int5[0] = A124BarAgrReo ;
               GXv_char4[0] = A122BarAgrPar ;
               GXv_char1[0] = AV8Maqcod ;
               GXv_char8[0] = AV13Usurcod ;
               GXv_char9[0] = AV14station ;
               new app.pprc206(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_int5, GXv_char4, GXv_char1, GXv_char8, GXv_char9) ;
               pmaqasignar.this.A396EmprCod = GXv_char7[0] ;
               pmaqasignar.this.A119BarAgrCod = GXv_int2[0] ;
               pmaqasignar.this.A124BarAgrReo = GXv_int5[0] ;
               pmaqasignar.this.A122BarAgrPar = GXv_char4[0] ;
               pmaqasignar.this.AV8Maqcod = GXv_char1[0] ;
               pmaqasignar.this.AV13Usurcod = GXv_char8[0] ;
               pmaqasignar.this.AV14station = GXv_char9[0] ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         /* Using cursor P05UA7 */
         pr_default.execute(5, new Object[] {A180BarMaqCod, Byte.valueOf(A3594BarPriTin), Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmaqasignar.this.AV12emprcod;
      this.aP1[0] = pmaqasignar.this.AV11barcod;
      this.aP2[0] = pmaqasignar.this.AV10barcodreo;
      this.aP3[0] = pmaqasignar.this.AV9barcodpar;
      this.aP4[0] = pmaqasignar.this.AV8Maqcod;
      this.aP5[0] = pmaqasignar.this.AV13Usurcod;
      this.aP6[0] = pmaqasignar.this.AV14station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmaqasignar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05UA2_A396EmprCod = new String[] {""} ;
      P05UA2_A180BarMaqCod = new String[] {""} ;
      P05UA2_A3594BarPriTin = new byte[1] ;
      P05UA2_A213BarSit = new byte[1] ;
      P05UA2_A129BarCod = new int[1] ;
      P05UA2_A132BarCodReo = new byte[1] ;
      P05UA2_A130BarCodPar = new String[] {""} ;
      P05UA2_A120BarAgrEst = new String[] {""} ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      AV19Barcodparm = "" ;
      AV25Op = "" ;
      GXv_int3 = new byte[1] ;
      AV21fecha = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      P05UA3_A130BarCodPar = new String[] {""} ;
      P05UA3_A132BarCodReo = new byte[1] ;
      P05UA3_A129BarCod = new int[1] ;
      P05UA3_A396EmprCod = new String[] {""} ;
      P05UA3_A180BarMaqCod = new String[] {""} ;
      P05UA3_A3594BarPriTin = new byte[1] ;
      P05UA3_A213BarSit = new byte[1] ;
      P05UA3_A120BarAgrEst = new String[] {""} ;
      AV15Inc_obs = "" ;
      AV27Pgmname = "" ;
      P05UA4_A396EmprCod = new String[] {""} ;
      P05UA4_A129BarCod = new int[1] ;
      P05UA4_A132BarCodReo = new byte[1] ;
      P05UA4_A130BarCodPar = new String[] {""} ;
      P05UA4_A150BarFacTin = new String[] {""} ;
      P05UA4_A603MaqCodBis = new String[] {""} ;
      P05UA4_A194BarOrdLin = new short[1] ;
      P05UA4_A153BarFasEst = new byte[1] ;
      P05UA4_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      P05UA6_A396EmprCod = new String[] {""} ;
      P05UA6_A129BarCod = new int[1] ;
      P05UA6_A132BarCodReo = new byte[1] ;
      P05UA6_A130BarCodPar = new String[] {""} ;
      P05UA6_A119BarAgrCod = new int[1] ;
      P05UA6_A124BarAgrReo = new byte[1] ;
      P05UA6_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char7 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqasignar__default(),
         new Object[] {
             new Object[] {
            P05UA2_A396EmprCod, P05UA2_A180BarMaqCod, P05UA2_A3594BarPriTin, P05UA2_A213BarSit, P05UA2_A129BarCod, P05UA2_A132BarCodReo, P05UA2_A130BarCodPar, P05UA2_A120BarAgrEst
            }
            , new Object[] {
            P05UA3_A130BarCodPar, P05UA3_A132BarCodReo, P05UA3_A129BarCod, P05UA3_A396EmprCod, P05UA3_A180BarMaqCod, P05UA3_A3594BarPriTin, P05UA3_A213BarSit, P05UA3_A120BarAgrEst
            }
            , new Object[] {
            P05UA4_A396EmprCod, P05UA4_A129BarCod, P05UA4_A132BarCodReo, P05UA4_A130BarCodPar, P05UA4_A150BarFacTin, P05UA4_A603MaqCodBis, P05UA4_A194BarOrdLin, P05UA4_A153BarFasEst, P05UA4_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05UA6_A396EmprCod, P05UA6_A129BarCod, P05UA6_A132BarCodReo, P05UA6_A130BarCodPar, P05UA6_A119BarAgrCod, P05UA6_A124BarAgrReo, P05UA6_A122BarAgrPar
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "PMaqAsignar" ;
      /* GeneXus formulas. */
      AV27Pgmname = "PMaqAsignar" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte AV18BarPritin ;
   private byte A3594BarPriTin ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV17Barcodreom ;
   private byte GXv_int3[] ;
   private byte AV20BarFasEst ;
   private byte A153BarFasEst ;
   private byte A124BarAgrReo ;
   private byte GXv_int5[] ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV11barcod ;
   private int A129BarCod ;
   private int AV16Barcodm ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private String AV12emprcod ;
   private String AV9barcodpar ;
   private String AV8Maqcod ;
   private String AV13Usurcod ;
   private String AV14station ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String AV19Barcodparm ;
   private String AV25Op ;
   private String AV27Pgmname ;
   private String A150BarFacTin ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String A122BarAgrPar ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private java.util.Date AV21fecha ;
   private java.util.Date GXv_date6[] ;
   private String AV15Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05UA2_A396EmprCod ;
   private String[] P05UA2_A180BarMaqCod ;
   private byte[] P05UA2_A3594BarPriTin ;
   private byte[] P05UA2_A213BarSit ;
   private int[] P05UA2_A129BarCod ;
   private byte[] P05UA2_A132BarCodReo ;
   private String[] P05UA2_A130BarCodPar ;
   private String[] P05UA2_A120BarAgrEst ;
   private String[] P05UA3_A130BarCodPar ;
   private byte[] P05UA3_A132BarCodReo ;
   private int[] P05UA3_A129BarCod ;
   private String[] P05UA3_A396EmprCod ;
   private String[] P05UA3_A180BarMaqCod ;
   private byte[] P05UA3_A3594BarPriTin ;
   private byte[] P05UA3_A213BarSit ;
   private String[] P05UA3_A120BarAgrEst ;
   private String[] P05UA4_A396EmprCod ;
   private int[] P05UA4_A129BarCod ;
   private byte[] P05UA4_A132BarCodReo ;
   private String[] P05UA4_A130BarCodPar ;
   private String[] P05UA4_A150BarFacTin ;
   private String[] P05UA4_A603MaqCodBis ;
   private short[] P05UA4_A194BarOrdLin ;
   private byte[] P05UA4_A153BarFasEst ;
   private String[] P05UA4_A758ProCod ;
   private String[] P05UA6_A396EmprCod ;
   private int[] P05UA6_A129BarCod ;
   private byte[] P05UA6_A132BarCodReo ;
   private String[] P05UA6_A130BarCodPar ;
   private int[] P05UA6_A119BarAgrCod ;
   private byte[] P05UA6_A124BarAgrReo ;
   private String[] P05UA6_A122BarAgrPar ;
}

final  class pmaqasignar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05UA2", "SELECT EmprCod, BarMaqCod, BarPriTin, BarSit, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE (EmprCod = ? and BarMaqCod = ?) AND (BarSit < 5) AND (BarPriTin <> 80) ORDER BY EmprCod, BarMaqCod, BarPriTin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05UA3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarMaqCod, BarPriTin, BarSit, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05UA4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, MaqCodBis, BarOrdLin, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05UA5", "UPDATE TXPBARFAS SET MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P05UA6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05UA7", "UPDATE TXPBARCAD SET BarMaqCod=?, BarPriTin=?, BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

