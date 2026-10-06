package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens012 extends GXProcedure
{
   public pens012( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens012.class ), "" );
   }

   public pens012( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pens012.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pens012.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens012.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV8HdrLab ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRLAB", ""), GXv_int2) ;
      pens012.this.GXt_int1 = GXv_int2[0] ;
      AV8HdrLab = GXt_int1 ;
      /* Using cursor P01TD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01TD2_A252CliCod[0] ;
         A5533Lb_ArtCod = P01TD2_A5533Lb_ArtCod[0] ;
         A5536Lb_ColNom = P01TD2_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P01TD2_A5537Lb_ColNum[0] ;
         A831TipColCod = P01TD2_A831TipColCod[0] ;
         n831TipColCod = P01TD2_n831TipColCod[0] ;
         AV9CliCod = A252CliCod ;
         AV10Lb_ArtCod = A5533Lb_ArtCod ;
         AV11Lb_ColNom = A5536Lb_ColNom ;
         AV12Lb_ColNum = A5537Lb_ColNum ;
         AV13TipColCod = A831TipColCod ;
         /* Execute user subroutine: 'LEO_FORMULA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Optimized DELETE. */
         /* Using cursor P01TD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01TD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01TD5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01TD6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
         /* End optimized DELETE. */
         /* Using cursor P01TD7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV8HdrLab == 1 )
      {
         /* Execute user subroutine: 'LEO_FORMULA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV14CFormu == 0 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = AV9CliCod ;
            GXv_char5[0] = AV10Lb_ArtCod ;
            GXv_char6[0] = AV11Lb_ColNom ;
            GXv_int7[0] = AV12Lb_ColNum ;
            GXv_int2[0] = AV13TipColCod ;
            GXv_int8[0] = (byte)(2) ;
            GXv_int9[0] = A5532Lb_numero ;
            new app.gestionlaboratorio.penshrl(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int2, GXv_int8, GXv_int9) ;
            pens012.this.A396EmprCod = GXv_char3[0] ;
            pens012.this.AV9CliCod = GXv_int4[0] ;
            pens012.this.AV10Lb_ArtCod = GXv_char5[0] ;
            pens012.this.AV11Lb_ColNom = GXv_char6[0] ;
            pens012.this.AV12Lb_ColNum = GXv_int7[0] ;
            pens012.this.AV13TipColCod = GXv_int2[0] ;
            pens012.this.A5532Lb_numero = GXv_int9[0] ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LEO_FORMULA' Routine */
      returnInSub = false ;
      AV14CFormu = (byte)(0) ;
      /* Using cursor P01TD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV10Lb_ArtCod, AV11Lb_ColNom, Integer.valueOf(AV12Lb_ColNum), Byte.valueOf(AV13TipColCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A831TipColCod = P01TD8_A831TipColCod[0] ;
         n831TipColCod = P01TD8_n831TipColCod[0] ;
         A483ForColNum = P01TD8_A483ForColNum[0] ;
         A482ForColNom = P01TD8_A482ForColNom[0] ;
         A494ForSer = P01TD8_A494ForSer[0] ;
         A252CliCod = P01TD8_A252CliCod[0] ;
         AV14CFormu = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens012.this.A396EmprCod;
      this.aP1[0] = pens012.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "pens012");
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
      P01TD2_A396EmprCod = new String[] {""} ;
      P01TD2_A5532Lb_numero = new int[1] ;
      P01TD2_A252CliCod = new int[1] ;
      P01TD2_A5533Lb_ArtCod = new String[] {""} ;
      P01TD2_A5536Lb_ColNom = new String[] {""} ;
      P01TD2_A5537Lb_ColNum = new int[1] ;
      P01TD2_A831TipColCod = new byte[1] ;
      P01TD2_n831TipColCod = new boolean[] {false} ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      AV10Lb_ArtCod = "" ;
      AV11Lb_ColNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int9 = new int[1] ;
      P01TD8_A396EmprCod = new String[] {""} ;
      P01TD8_A831TipColCod = new byte[1] ;
      P01TD8_n831TipColCod = new boolean[] {false} ;
      P01TD8_A483ForColNum = new int[1] ;
      P01TD8_A482ForColNom = new String[] {""} ;
      P01TD8_A494ForSer = new String[] {""} ;
      P01TD8_A252CliCod = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens012__default(),
         new Object[] {
             new Object[] {
            P01TD2_A396EmprCod, P01TD2_A5532Lb_numero, P01TD2_A252CliCod, P01TD2_A5533Lb_ArtCod, P01TD2_A5536Lb_ColNom, P01TD2_A5537Lb_ColNum, P01TD2_A831TipColCod, P01TD2_n831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01TD8_A396EmprCod, P01TD8_A831TipColCod, P01TD8_A483ForColNum, P01TD8_A482ForColNom, P01TD8_A494ForSer, P01TD8_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8HdrLab ;
   private byte GXt_int1 ;
   private byte A831TipColCod ;
   private byte AV13TipColCod ;
   private byte AV14CFormu ;
   private byte GXv_int2[] ;
   private byte GXv_int8[] ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV9CliCod ;
   private int AV12Lb_ColNum ;
   private int GXv_int4[] ;
   private int GXv_int7[] ;
   private int GXv_int9[] ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String AV10Lb_ArtCod ;
   private String AV11Lb_ColNom ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n831TipColCod ;
   private boolean returnInSub ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01TD2_A396EmprCod ;
   private int[] P01TD2_A5532Lb_numero ;
   private int[] P01TD2_A252CliCod ;
   private String[] P01TD2_A5533Lb_ArtCod ;
   private String[] P01TD2_A5536Lb_ColNom ;
   private int[] P01TD2_A5537Lb_ColNum ;
   private byte[] P01TD2_A831TipColCod ;
   private boolean[] P01TD2_n831TipColCod ;
   private String[] P01TD8_A396EmprCod ;
   private byte[] P01TD8_A831TipColCod ;
   private boolean[] P01TD8_n831TipColCod ;
   private int[] P01TD8_A483ForColNum ;
   private String[] P01TD8_A482ForColNom ;
   private String[] P01TD8_A494ForSer ;
   private int[] P01TD8_A252CliCod ;
}

final  class pens012__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TD2", "SELECT EmprCod, Lb_numero, CliCod, Lb_ArtCod, Lb_ColNom, Lb_ColNum, TipColCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01TD3", "DELETE FROM TXPENS000  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS000")
         ,new UpdateCursor("P01TD4", "DELETE FROM TXPENS002  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new UpdateCursor("P01TD5", "DELETE FROM TXPENS003  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
         ,new UpdateCursor("P01TD6", "DELETE FROM TXPENS004  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
         ,new UpdateCursor("P01TD7", "DELETE FROM TXPENS001  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
         ,new ForEachCursor("P01TD8", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

