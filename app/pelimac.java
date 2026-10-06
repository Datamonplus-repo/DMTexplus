package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelimac extends GXProcedure
{
   public pelimac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelimac.class ), "" );
   }

   public pelimac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 )
   {
      pelimac.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 )
   {
      pelimac.this.AV15EmprCod = aP0;
      pelimac.this.AV14MacCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV8Tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      pelimac.this.GXt_int1 = GXv_int2[0] ;
      AV8Tinamar = GXt_int1 ;
      AV10UsurCod = " " ;
      GXt_char3 = AV11Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pelimac.this.GXt_char3 = GXv_char4[0] ;
      AV11Station = GXt_char3 ;
      GXv_char4[0] = AV15EmprCod ;
      GXv_char5[0] = AV12EmprNom ;
      GXv_char6[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char4, GXv_char5, GXv_char6) ;
      pelimac.this.AV15EmprCod = GXv_char4[0] ;
      pelimac.this.AV12EmprNom = GXv_char5[0] ;
      pelimac.this.AV10UsurCod = GXv_char6[0] ;
      AV13Inc_obs = httpContext.getMessage( "Eliminacion Accesorios, Nº ", "") + GXutil.str( AV14MacCod, 8, 0) + GXutil.newLine( ) ;
      /* Using cursor P00QE2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV14MacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P00QE2_A1199MacCod[0] ;
         A396EmprCod = P00QE2_A396EmprCod[0] ;
         /* Using cursor P00QE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1202MacDisCod = P00QE3_A1202MacDisCod[0] ;
            A1203MacBarCod = P00QE3_A1203MacBarCod[0] ;
            A1205MacBarPar = P00QE3_A1205MacBarPar[0] ;
            A1204MacBarReo = P00QE3_A1204MacBarReo[0] ;
            A1201MacLin = P00QE3_A1201MacLin[0] ;
            AV9Discod = A1202MacDisCod ;
            if ( AV8Tinamar == 1 )
            {
               /* Execute user subroutine: 'DISPOS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Using cursor P00QE4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
            AV13Inc_obs += httpContext.getMessage( "N Disp Interna ", "") + GXutil.str( A1202MacDisCod, 8, 0) + GXutil.newLine( ) ;
            if ( A1203MacBarCod > 0 )
            {
               AV13Inc_obs += httpContext.getMessage( "Hdr ", "") + GXutil.str( A1203MacBarCod, 8, 0) + "-" + GXutil.str( A1204MacBarReo, 1, 0) + A1205MacBarPar + GXutil.newLine( ) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00QE5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13Inc_obs, " ") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV10UsurCod, AV11Station, AV13Inc_obs, AV14MacCod, (byte)(0), "") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      n4476DisAcaFor = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00QE6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV9Discod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP1[0] = pelimac.this.AV14MacCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV10UsurCod = "" ;
      AV11Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV12EmprNom = "" ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV13Inc_obs = "" ;
      scmdbuf = "" ;
      P00QE2_A1199MacCod = new int[1] ;
      P00QE2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      P00QE3_A396EmprCod = new String[] {""} ;
      P00QE3_A1199MacCod = new int[1] ;
      P00QE3_A1202MacDisCod = new int[1] ;
      P00QE3_A1203MacBarCod = new int[1] ;
      P00QE3_A1205MacBarPar = new String[] {""} ;
      P00QE3_A1204MacBarReo = new byte[1] ;
      P00QE3_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV20Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelimac__default(),
         new Object[] {
             new Object[] {
            P00QE2_A1199MacCod, P00QE2_A396EmprCod
            }
            , new Object[] {
            P00QE3_A396EmprCod, P00QE3_A1199MacCod, P00QE3_A1202MacDisCod, P00QE3_A1203MacBarCod, P00QE3_A1205MacBarPar, P00QE3_A1204MacBarReo, P00QE3_A1201MacLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PELIMAC" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PELIMAC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV8Tinamar ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A1204MacBarReo ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int AV14MacCod ;
   private int A1199MacCod ;
   private int A1202MacDisCod ;
   private int A1203MacBarCod ;
   private int AV9Discod ;
   private String AV15EmprCod ;
   private String AV10UsurCod ;
   private String AV11Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV12EmprNom ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1205MacBarPar ;
   private String AV20Pgmname ;
   private boolean returnInSub ;
   private boolean n4476DisAcaFor ;
   private String AV13Inc_obs ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P00QE2_A1199MacCod ;
   private String[] P00QE2_A396EmprCod ;
   private String[] P00QE3_A396EmprCod ;
   private int[] P00QE3_A1199MacCod ;
   private int[] P00QE3_A1202MacDisCod ;
   private int[] P00QE3_A1203MacBarCod ;
   private String[] P00QE3_A1205MacBarPar ;
   private byte[] P00QE3_A1204MacBarReo ;
   private short[] P00QE3_A1201MacLin ;
}

final  class pelimac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00QE2", "SELECT MacCod, EmprCod FROM TXPCMACRO WHERE MacCod = ? ORDER BY EmprCod, MacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00QE3", "SELECT EmprCod, MacCod, MacDisCod, MacBarCod, MacBarPar, MacBarReo, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00QE4", "DELETE FROM TXPLMACRO  WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new UpdateCursor("P00QE5", "DELETE FROM TXPCMACRO  WHERE EmprCod = ? AND MacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACRO")
         ,new UpdateCursor("P00QE6", "UPDATE TXPDISPOS SET DisAcaFor=0  WHERE DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

