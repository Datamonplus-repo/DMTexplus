package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appdispar extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appdispar pgm = new appdispar (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public appdispar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appdispar.class ), "" );
   }

   public appdispar( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Procesando DISPAR.....", "") );
      AV8Emprcod = "001" ;
      /* Using cursor P03DY2 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P03DY2_A361DisCod[0] ;
         A396EmprCod = P03DY2_A396EmprCod[0] ;
         A252CliCod = P03DY2_A252CliCod[0] ;
         A335DisArtCod = P03DY2_A335DisArtCod[0] ;
         W396EmprCod = A396EmprCod ;
         AV13Discod = A361DisCod ;
         AV9Clicod = A252CliCod ;
         AV10Artcod = A335DisArtCod ;
         /* Using cursor P03DY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = P03DY3_A457FasCod[0] ;
            A368DisFasLin = P03DY3_A368DisFasLin[0] ;
            A758ProCod = P03DY3_A758ProCod[0] ;
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            AV11Procod = A758ProCod ;
            AV12FasCod = A457FasCod ;
            AV14Disfaslin = A368DisFasLin ;
            /* Using cursor P03DY4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9Clicod), AV10Artcod, AV11Procod, AV12FasCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1668ParFasVal = P03DY4_A1668ParFasVal[0] ;
               A1673ParFasObs = P03DY4_A1673ParFasObs[0] ;
               A1664ParFasCod = P03DY4_A1664ParFasCod[0] ;
               A457FasCod = P03DY4_A457FasCod[0] ;
               A758ProCod = P03DY4_A758ProCod[0] ;
               A65ArtCod = P03DY4_A65ArtCod[0] ;
               A252CliCod = P03DY4_A252CliCod[0] ;
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               /*
                  INSERT RECORD ON TABLE TXPDISPAR

               */
               W396EmprCod = A396EmprCod ;
               W361DisCod = A361DisCod ;
               W758ProCod = A758ProCod ;
               W368DisFasLin = A368DisFasLin ;
               W1664ParFasCod = A1664ParFasCod ;
               A396EmprCod = AV8Emprcod ;
               A361DisCod = AV13Discod ;
               A758ProCod = AV11Procod ;
               A368DisFasLin = AV14Disfaslin ;
               A3685DisParVal = A1668ParFasVal ;
               A3686DisParObs = A1673ParFasObs ;
               /* Using cursor P03DY5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
               if ( (pr_default.getStatus(3) == 1) )
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
               A361DisCod = W361DisCod ;
               A758ProCod = W758ProCod ;
               A368DisFasLin = W368DisFasLin ;
               A1664ParFasCod = W1664ParFasCod ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "appdispar");
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Procesando DISPAR.....", ""));
      /* Using cursor P03DY6 */
      pr_default.execute(4, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = P03DY6_A130BarCodPar[0] ;
         A132BarCodReo = P03DY6_A132BarCodReo[0] ;
         A129BarCod = P03DY6_A129BarCod[0] ;
         A396EmprCod = P03DY6_A396EmprCod[0] ;
         A361DisCod = P03DY6_A361DisCod[0] ;
         A212BarSer = P03DY6_A212BarSer[0] ;
         AV13Discod = A361DisCod ;
         AV15Barcod = A129BarCod ;
         AV16barcodreo = A132BarCodReo ;
         AV17Barcodpar = A130BarCodPar ;
         AV18LastLinea = (short)(0) ;
         /* Using cursor P03DY7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A457FasCod = P03DY7_A457FasCod[0] ;
            A194BarOrdLin = P03DY7_A194BarOrdLin[0] ;
            A758ProCod = P03DY7_A758ProCod[0] ;
            AV11Procod = A758ProCod ;
            AV14Disfaslin = A194BarOrdLin ;
            AV12FasCod = A457FasCod ;
            /* Execute user subroutine: 'DISPAR' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      cleanup();
   }

   public void S111( )
   {
      /* 'DISPAR' Routine */
      returnInSub = false ;
      /* Using cursor P03DY8 */
      pr_default.execute(6, new Object[] {AV8Emprcod, Integer.valueOf(AV13Discod), AV11Procod, AV12FasCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A368DisFasLin = P03DY8_A368DisFasLin[0] ;
         A758ProCod = P03DY8_A758ProCod[0] ;
         A361DisCod = P03DY8_A361DisCod[0] ;
         A396EmprCod = P03DY8_A396EmprCod[0] ;
         A457FasCod = P03DY8_A457FasCod[0] ;
         A3697FasApr = P03DY8_A3697FasApr[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         if ( ( AV18LastLinea == 0 ) || ( ( A368DisFasLin > AV18LastLinea ) ) )
         {
            /* Using cursor P03DY9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A3687DisParTxt = P03DY9_A3687DisParTxt[0] ;
               A3685DisParVal = P03DY9_A3685DisParVal[0] ;
               A3686DisParObs = P03DY9_A3686DisParObs[0] ;
               A1664ParFasCod = P03DY9_A1664ParFasCod[0] ;
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               /*
                  INSERT RECORD ON TABLE TXPBarPar

               */
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               A396EmprCod = AV8Emprcod ;
               A129BarCod = AV15Barcod ;
               A132BarCodReo = AV16barcodreo ;
               A130BarCodPar = AV17Barcodpar ;
               A758ProCod = AV11Procod ;
               A194BarOrdLin = AV14Disfaslin ;
               A3295BarParVal = A3685DisParVal ;
               A3296BarParObs = A3686DisParObs ;
               A3693BarParTxt = A3687DisParTxt ;
               n3693BarParTxt = false ;
               A9737BarValPar = GXutil.space( (short)(8)) ;
               /* Using cursor P03DY10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod), A3295BarParVal, A3296BarParObs, Boolean.valueOf(n3693BarParTxt), A3693BarParTxt, A9737BarValPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
               if ( (pr_default.getStatus(8) == 1) )
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
               A758ProCod = W758ProCod ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV18LastLinea = A368DisFasLin ;
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppdispar.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "appdispar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Emprcod = "" ;
      scmdbuf = "" ;
      P03DY2_A361DisCod = new int[1] ;
      P03DY2_A396EmprCod = new String[] {""} ;
      P03DY2_A252CliCod = new int[1] ;
      P03DY2_A335DisArtCod = new String[] {""} ;
      A396EmprCod = "" ;
      A335DisArtCod = "" ;
      W396EmprCod = "" ;
      AV10Artcod = "" ;
      P03DY3_A396EmprCod = new String[] {""} ;
      P03DY3_A361DisCod = new int[1] ;
      P03DY3_A457FasCod = new String[] {""} ;
      P03DY3_A368DisFasLin = new short[1] ;
      P03DY3_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV11Procod = "" ;
      AV12FasCod = "" ;
      P03DY4_A396EmprCod = new String[] {""} ;
      P03DY4_A1668ParFasVal = new String[] {""} ;
      P03DY4_A1673ParFasObs = new String[] {""} ;
      P03DY4_A1664ParFasCod = new short[1] ;
      P03DY4_A457FasCod = new String[] {""} ;
      P03DY4_A758ProCod = new String[] {""} ;
      P03DY4_A65ArtCod = new String[] {""} ;
      P03DY4_A252CliCod = new int[1] ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A65ArtCod = "" ;
      W758ProCod = "" ;
      A3685DisParVal = "" ;
      A3686DisParObs = "" ;
      Gx_emsg = "" ;
      P03DY6_A130BarCodPar = new String[] {""} ;
      P03DY6_A132BarCodReo = new byte[1] ;
      P03DY6_A129BarCod = new int[1] ;
      P03DY6_A396EmprCod = new String[] {""} ;
      P03DY6_A361DisCod = new int[1] ;
      P03DY6_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      AV17Barcodpar = "" ;
      P03DY7_A396EmprCod = new String[] {""} ;
      P03DY7_A129BarCod = new int[1] ;
      P03DY7_A132BarCodReo = new byte[1] ;
      P03DY7_A130BarCodPar = new String[] {""} ;
      P03DY7_A457FasCod = new String[] {""} ;
      P03DY7_A194BarOrdLin = new short[1] ;
      P03DY7_A758ProCod = new String[] {""} ;
      P03DY8_A368DisFasLin = new short[1] ;
      P03DY8_A758ProCod = new String[] {""} ;
      P03DY8_A361DisCod = new int[1] ;
      P03DY8_A396EmprCod = new String[] {""} ;
      P03DY8_A457FasCod = new String[] {""} ;
      P03DY8_A3697FasApr = new String[] {""} ;
      A3697FasApr = "" ;
      P03DY9_A3687DisParTxt = new String[] {""} ;
      P03DY9_A396EmprCod = new String[] {""} ;
      P03DY9_A361DisCod = new int[1] ;
      P03DY9_A758ProCod = new String[] {""} ;
      P03DY9_A368DisFasLin = new short[1] ;
      P03DY9_A3685DisParVal = new String[] {""} ;
      P03DY9_A3686DisParObs = new String[] {""} ;
      P03DY9_A1664ParFasCod = new short[1] ;
      A3687DisParTxt = "" ;
      A3295BarParVal = "" ;
      A3296BarParObs = "" ;
      A3693BarParTxt = "" ;
      A9737BarValPar = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.appdispar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.appdispar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.appdispar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.appdispar__default(),
         new Object[] {
             new Object[] {
            P03DY2_A361DisCod, P03DY2_A396EmprCod, P03DY2_A252CliCod, P03DY2_A335DisArtCod
            }
            , new Object[] {
            P03DY3_A396EmprCod, P03DY3_A361DisCod, P03DY3_A457FasCod, P03DY3_A368DisFasLin, P03DY3_A758ProCod
            }
            , new Object[] {
            P03DY4_A396EmprCod, P03DY4_A1668ParFasVal, P03DY4_A1673ParFasObs, P03DY4_A1664ParFasCod, P03DY4_A457FasCod, P03DY4_A758ProCod, P03DY4_A65ArtCod, P03DY4_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03DY6_A130BarCodPar, P03DY6_A132BarCodReo, P03DY6_A129BarCod, P03DY6_A396EmprCod, P03DY6_A361DisCod, P03DY6_A212BarSer
            }
            , new Object[] {
            P03DY7_A396EmprCod, P03DY7_A129BarCod, P03DY7_A132BarCodReo, P03DY7_A130BarCodPar, P03DY7_A457FasCod, P03DY7_A194BarOrdLin, P03DY7_A758ProCod
            }
            , new Object[] {
            P03DY8_A368DisFasLin, P03DY8_A758ProCod, P03DY8_A361DisCod, P03DY8_A396EmprCod, P03DY8_A457FasCod, P03DY8_A3697FasApr
            }
            , new Object[] {
            P03DY9_A3687DisParTxt, P03DY9_A396EmprCod, P03DY9_A361DisCod, P03DY9_A758ProCod, P03DY9_A368DisFasLin, P03DY9_A3685DisParVal, P03DY9_A3686DisParObs, P03DY9_A1664ParFasCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV16barcodreo ;
   private short A368DisFasLin ;
   private short AV14Disfaslin ;
   private short A1664ParFasCod ;
   private short W368DisFasLin ;
   private short W1664ParFasCod ;
   private short Gx_err ;
   private short AV18LastLinea ;
   private short A194BarOrdLin ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV13Discod ;
   private int AV9Clicod ;
   private int W361DisCod ;
   private int GX_INS517 ;
   private int A129BarCod ;
   private int AV15Barcod ;
   private int GX_INS475 ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A335DisArtCod ;
   private String W396EmprCod ;
   private String AV10Artcod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV11Procod ;
   private String AV12FasCod ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A65ArtCod ;
   private String W758ProCod ;
   private String A3685DisParVal ;
   private String A3686DisParObs ;
   private String Gx_emsg ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String AV17Barcodpar ;
   private String A3697FasApr ;
   private String A3295BarParVal ;
   private String A3296BarParObs ;
   private String A9737BarValPar ;
   private boolean returnInSub ;
   private boolean n3693BarParTxt ;
   private String A3687DisParTxt ;
   private String A3693BarParTxt ;
   private IDataStoreProvider pr_default ;
   private int[] P03DY2_A361DisCod ;
   private String[] P03DY2_A396EmprCod ;
   private int[] P03DY2_A252CliCod ;
   private String[] P03DY2_A335DisArtCod ;
   private String[] P03DY3_A396EmprCod ;
   private int[] P03DY3_A361DisCod ;
   private String[] P03DY3_A457FasCod ;
   private short[] P03DY3_A368DisFasLin ;
   private String[] P03DY3_A758ProCod ;
   private String[] P03DY4_A396EmprCod ;
   private String[] P03DY4_A1668ParFasVal ;
   private String[] P03DY4_A1673ParFasObs ;
   private short[] P03DY4_A1664ParFasCod ;
   private String[] P03DY4_A457FasCod ;
   private String[] P03DY4_A758ProCod ;
   private String[] P03DY4_A65ArtCod ;
   private int[] P03DY4_A252CliCod ;
   private String[] P03DY6_A130BarCodPar ;
   private byte[] P03DY6_A132BarCodReo ;
   private int[] P03DY6_A129BarCod ;
   private String[] P03DY6_A396EmprCod ;
   private int[] P03DY6_A361DisCod ;
   private String[] P03DY6_A212BarSer ;
   private String[] P03DY7_A396EmprCod ;
   private int[] P03DY7_A129BarCod ;
   private byte[] P03DY7_A132BarCodReo ;
   private String[] P03DY7_A130BarCodPar ;
   private String[] P03DY7_A457FasCod ;
   private short[] P03DY7_A194BarOrdLin ;
   private String[] P03DY7_A758ProCod ;
   private short[] P03DY8_A368DisFasLin ;
   private String[] P03DY8_A758ProCod ;
   private int[] P03DY8_A361DisCod ;
   private String[] P03DY8_A396EmprCod ;
   private String[] P03DY8_A457FasCod ;
   private String[] P03DY8_A3697FasApr ;
   private String[] P03DY9_A3687DisParTxt ;
   private String[] P03DY9_A396EmprCod ;
   private int[] P03DY9_A361DisCod ;
   private String[] P03DY9_A758ProCod ;
   private short[] P03DY9_A368DisFasLin ;
   private String[] P03DY9_A3685DisParVal ;
   private String[] P03DY9_A3686DisParObs ;
   private short[] P03DY9_A1664ParFasCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class appdispar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class appdispar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class appdispar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class appdispar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DY2", "SELECT DisCod, EmprCod, CliCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod > 0 ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DY3", "SELECT EmprCod, DisCod, FasCod, DisFasLin, ProCod FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DY4", "SELECT EmprCod, ParFasVal, ParFasObs, ParFasCod, FasCod, ProCod, ArtCod, CliCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03DY5", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParTxt, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new ForEachCursor("P03DY6", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, DisCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and DisCod > 0 ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DY7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DY8", "SELECT DisFasLin, ProCod, DisCod, EmprCod, FasCod, FasApr FROM TXPDISFAS WHERE (EmprCod = ? and DisCod = ? and ProCod = ?) AND (FasCod = ?) ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DY9", "SELECT DisParTxt, EmprCod, DisCod, ProCod, DisFasLin, DisParVal, DisParObs, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03DY10", "INSERT INTO TXPBarPar(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarParObs, BarParTxt, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 60);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[10], 400);
               }
               stmt.setString(11, (String)parms[11], 8);
               return;
      }
   }

}

