package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfashdr extends GXProcedure
{
   public pfashdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfashdr.class ), "" );
   }

   public pfashdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           short[] aP5 )
   {
      pfashdr.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 )
   {
      pfashdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfashdr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfashdr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfashdr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfashdr.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pfashdr.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pfashdr.this.AV8FlagRec = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV10Msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN156", ""), (byte)(99), GXv_char2) ;
      pfashdr.this.GXt_char1 = GXv_char2[0] ;
      AV10Msg1 = GXt_char1 ;
      AV11Station = context.getWorkstationId( remoteHandle) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char4[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      pfashdr.this.A396EmprCod = GXv_char2[0] ;
      pfashdr.this.AV12EmprNom = GXv_char3[0] ;
      pfashdr.this.AV13UsurCod = GXv_char4[0] ;
      AV8FlagRec = (byte)(0) ;
      /* Using cursor P01B02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4268RecOrdLin = P01B02_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P01B02_n4268RecOrdLin[0] ;
         A2804RecLinMaq = P01B02_A2804RecLinMaq[0] ;
         AV9RecLinMaq = A2804RecLinMaq ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01B03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV9RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P01B03_A2804RecLinMaq[0] ;
         A764ProForCod = P01B03_A764ProForCod[0] ;
         A1273RecLinPro = P01B03_A1273RecLinPro[0] ;
         AV8FlagRec = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV8FlagRec == 1 )
      {
         httpContext.GX_msglist.addItem(AV10Msg1);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         /* Using cursor P01B04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            /* Optimized DELETE. */
            /* Using cursor P01B05 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
            /* End optimized DELETE. */
            /* Using cursor P01B06 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A5371FasQuiLin = P01B06_A5371FasQuiLin[0] ;
               /* Using cursor P01B07 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A7934Dtb_Ordl = P01B07_A7934Dtb_Ordl[0] ;
                  /* Optimized DELETE. */
                  /* Using cursor P01B08 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
                  /* End optimized DELETE. */
                  /* Using cursor P01B09 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(5);
               AV14Inc_obs = httpContext.getMessage( "PDELfasqui.Eliminacion FASQUI", "") + GXutil.newLine( ) ;
               AV14Inc_obs += httpContext.getMessage( "Procod=", "") + GXutil.trim( A758ProCod) + GXutil.newLine( ) ;
               AV14Inc_obs += httpContext.getMessage( "Orden =", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
               AV14Inc_obs += httpContext.getMessage( "Linea =", "") + GXutil.str( A5371FasQuiLin, 4, 0) + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV13UsurCod, AV11Station, AV14Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               /* Using cursor P01B010 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P01B011 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfashdr.this.A396EmprCod;
      this.aP1[0] = pfashdr.this.A129BarCod;
      this.aP2[0] = pfashdr.this.A132BarCodReo;
      this.aP3[0] = pfashdr.this.A130BarCodPar;
      this.aP4[0] = pfashdr.this.A758ProCod;
      this.aP5[0] = pfashdr.this.A194BarOrdLin;
      this.aP6[0] = pfashdr.this.AV8FlagRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfashdr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Msg1 = "" ;
      GXt_char1 = "" ;
      AV11Station = "" ;
      GXv_char2 = new String[1] ;
      AV12EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV13UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P01B02_A396EmprCod = new String[] {""} ;
      P01B02_A129BarCod = new int[1] ;
      P01B02_A132BarCodReo = new byte[1] ;
      P01B02_A130BarCodPar = new String[] {""} ;
      P01B02_A4268RecOrdLin = new short[1] ;
      P01B02_n4268RecOrdLin = new boolean[] {false} ;
      P01B02_A2804RecLinMaq = new short[1] ;
      P01B03_A396EmprCod = new String[] {""} ;
      P01B03_A129BarCod = new int[1] ;
      P01B03_A132BarCodReo = new byte[1] ;
      P01B03_A130BarCodPar = new String[] {""} ;
      P01B03_A2804RecLinMaq = new short[1] ;
      P01B03_A764ProForCod = new String[] {""} ;
      P01B03_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      P01B04_A396EmprCod = new String[] {""} ;
      P01B04_A129BarCod = new int[1] ;
      P01B04_A132BarCodReo = new byte[1] ;
      P01B04_A130BarCodPar = new String[] {""} ;
      P01B04_A758ProCod = new String[] {""} ;
      P01B04_A194BarOrdLin = new short[1] ;
      P01B06_A396EmprCod = new String[] {""} ;
      P01B06_A129BarCod = new int[1] ;
      P01B06_A132BarCodReo = new byte[1] ;
      P01B06_A130BarCodPar = new String[] {""} ;
      P01B06_A758ProCod = new String[] {""} ;
      P01B06_A194BarOrdLin = new short[1] ;
      P01B06_A5371FasQuiLin = new short[1] ;
      P01B07_A396EmprCod = new String[] {""} ;
      P01B07_A129BarCod = new int[1] ;
      P01B07_A132BarCodReo = new byte[1] ;
      P01B07_A130BarCodPar = new String[] {""} ;
      P01B07_A758ProCod = new String[] {""} ;
      P01B07_A194BarOrdLin = new short[1] ;
      P01B07_A7934Dtb_Ordl = new short[1] ;
      AV14Inc_obs = "" ;
      AV24Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfashdr__default(),
         new Object[] {
             new Object[] {
            P01B02_A396EmprCod, P01B02_A129BarCod, P01B02_A132BarCodReo, P01B02_A130BarCodPar, P01B02_A4268RecOrdLin, P01B02_n4268RecOrdLin, P01B02_A2804RecLinMaq
            }
            , new Object[] {
            P01B03_A396EmprCod, P01B03_A129BarCod, P01B03_A132BarCodReo, P01B03_A130BarCodPar, P01B03_A2804RecLinMaq, P01B03_A764ProForCod, P01B03_A1273RecLinPro
            }
            , new Object[] {
            P01B04_A396EmprCod, P01B04_A129BarCod, P01B04_A132BarCodReo, P01B04_A130BarCodPar, P01B04_A758ProCod, P01B04_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01B06_A396EmprCod, P01B06_A129BarCod, P01B06_A132BarCodReo, P01B06_A130BarCodPar, P01B06_A758ProCod, P01B06_A194BarOrdLin, P01B06_A5371FasQuiLin
            }
            , new Object[] {
            P01B07_A396EmprCod, P01B07_A129BarCod, P01B07_A132BarCodReo, P01B07_A130BarCodPar, P01B07_A758ProCod, P01B07_A194BarOrdLin, P01B07_A7934Dtb_Ordl
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "PFASHDR" ;
      /* GeneXus formulas. */
      AV24Pgmname = "PFASHDR" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8FlagRec ;
   private byte A1273RecLinPro ;
   private short A194BarOrdLin ;
   private short A4268RecOrdLin ;
   private short A2804RecLinMaq ;
   private short AV9RecLinMaq ;
   private short A5371FasQuiLin ;
   private short A7934Dtb_Ordl ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV10Msg1 ;
   private String GXt_char1 ;
   private String AV11Station ;
   private String GXv_char2[] ;
   private String AV12EmprNom ;
   private String GXv_char3[] ;
   private String AV13UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String AV24Pgmname ;
   private boolean n4268RecOrdLin ;
   private boolean returnInSub ;
   private String AV14Inc_obs ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01B02_A396EmprCod ;
   private int[] P01B02_A129BarCod ;
   private byte[] P01B02_A132BarCodReo ;
   private String[] P01B02_A130BarCodPar ;
   private short[] P01B02_A4268RecOrdLin ;
   private boolean[] P01B02_n4268RecOrdLin ;
   private short[] P01B02_A2804RecLinMaq ;
   private String[] P01B03_A396EmprCod ;
   private int[] P01B03_A129BarCod ;
   private byte[] P01B03_A132BarCodReo ;
   private String[] P01B03_A130BarCodPar ;
   private short[] P01B03_A2804RecLinMaq ;
   private String[] P01B03_A764ProForCod ;
   private byte[] P01B03_A1273RecLinPro ;
   private String[] P01B04_A396EmprCod ;
   private int[] P01B04_A129BarCod ;
   private byte[] P01B04_A132BarCodReo ;
   private String[] P01B04_A130BarCodPar ;
   private String[] P01B04_A758ProCod ;
   private short[] P01B04_A194BarOrdLin ;
   private String[] P01B06_A396EmprCod ;
   private int[] P01B06_A129BarCod ;
   private byte[] P01B06_A132BarCodReo ;
   private String[] P01B06_A130BarCodPar ;
   private String[] P01B06_A758ProCod ;
   private short[] P01B06_A194BarOrdLin ;
   private short[] P01B06_A5371FasQuiLin ;
   private String[] P01B07_A396EmprCod ;
   private int[] P01B07_A129BarCod ;
   private byte[] P01B07_A132BarCodReo ;
   private String[] P01B07_A130BarCodPar ;
   private String[] P01B07_A758ProCod ;
   private short[] P01B07_A194BarOrdLin ;
   private short[] P01B07_A7934Dtb_Ordl ;
}

final  class pfashdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01B02", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecOrdLin, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01B03", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, ProForCod, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01B04", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01B05", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new ForEachCursor("P01B06", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01B07", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Dtb_Ordl = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01B08", "DELETE FROM TXPDT0051  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
         ,new UpdateCursor("P01B09", "DELETE FROM TXPDT005  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new UpdateCursor("P01B010", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new UpdateCursor("P01B011", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

