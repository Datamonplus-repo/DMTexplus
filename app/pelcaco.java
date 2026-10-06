package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelcaco extends GXProcedure
{
   public pelcaco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelcaco.class ), "" );
   }

   public pelcaco( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pelcaco.this.aP1 = new int[] {0};
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
      pelcaco.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelcaco.this.A14AlbComCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15NumLin = (short)(0) ;
      GXt_int1 = AV18Firmad ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      pelcaco.this.GXt_int1 = GXv_int2[0] ;
      AV18Firmad = GXt_int1 ;
      GXt_int1 = AV19Torient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      pelcaco.this.GXt_int1 = GXv_int2[0] ;
      AV19Torient = GXt_int1 ;
      GXt_int1 = AV20tintutex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int2) ;
      pelcaco.this.GXt_int1 = GXv_int2[0] ;
      AV20tintutex = GXt_int1 ;
      GXt_char3 = AV22Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pelcaco.this.GXt_char3 = GXv_char4[0] ;
      AV22Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV23EmprNom ;
      GXv_char6[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char5, GXv_char6) ;
      pelcaco.this.A396EmprCod = GXv_char4[0] ;
      pelcaco.this.AV23EmprNom = GXv_char5[0] ;
      pelcaco.this.AV24UsurCod = GXv_char6[0] ;
      /* Optimized group. */
      /* Using cursor P02LZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      cV15NumLin = P02LZ2_AV15NumLin[0] ;
      pr_default.close(0);
      AV15NumLin = (short)(AV15NumLin+cV15NumLin*1) ;
      /* End optimized group. */
      if ( (0==AV15NumLin) )
      {
         /* Using cursor P02LZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A10738AlbComSt = P02LZ3_A10738AlbComSt[0] ;
            /* Optimized DELETE. */
            /* Using cursor P02LZ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P02LZ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALC");
            /* End optimized DELETE. */
            if ( ( AV18Firmad == 0 ) && ( AV20tintutex == 0 ) )
            {
               /* Using cursor P02LZ6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            }
            if ( ( AV18Firmad == 1 ) || ( AV20tintutex == 1 ) )
            {
               A10738AlbComSt = httpContext.getMessage( "A", "") ;
               AV21Inc_obs = httpContext.getMessage( "PELCACO-DOCUMENTO COMERCIAL COMO ANULADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Documento Comercial=", "") + GXutil.str( A14AlbComCod, 10, 0) + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV31Pgmname, AV24UsurCod, AV22Station, AV21Inc_obs, A14AlbComCod, (byte)(0), "") ;
            }
            /* Using cursor P02LZ7 */
            pr_default.execute(5, new Object[] {A10738AlbComSt, A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelcaco.this.A396EmprCod;
      this.aP1[0] = pelcaco.this.A14AlbComCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelcaco");
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
      AV22Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char5 = new String[1] ;
      AV24UsurCod = "" ;
      GXv_char6 = new String[1] ;
      scmdbuf = "" ;
      P02LZ2_AV15NumLin = new short[1] ;
      P02LZ3_A396EmprCod = new String[] {""} ;
      P02LZ3_A14AlbComCod = new int[1] ;
      P02LZ3_A10738AlbComSt = new String[] {""} ;
      A10738AlbComSt = "" ;
      AV21Inc_obs = "" ;
      AV31Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelcaco__default(),
         new Object[] {
             new Object[] {
            P02LZ2_AV15NumLin
            }
            , new Object[] {
            P02LZ3_A396EmprCod, P02LZ3_A14AlbComCod, P02LZ3_A10738AlbComSt
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
      AV31Pgmname = "PELCACO" ;
      /* GeneXus formulas. */
      AV31Pgmname = "PELCACO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV18Firmad ;
   private byte AV19Torient ;
   private byte AV20tintutex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV15NumLin ;
   private short cV15NumLin ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String AV22Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV23EmprNom ;
   private String GXv_char5[] ;
   private String AV24UsurCod ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A10738AlbComSt ;
   private String AV31Pgmname ;
   private String AV21Inc_obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P02LZ2_AV15NumLin ;
   private String[] P02LZ3_A396EmprCod ;
   private int[] P02LZ3_A14AlbComCod ;
   private String[] P02LZ3_A10738AlbComSt ;
}

final  class pelcaco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LZ2", "SELECT COUNT(*) FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02LZ3", "SELECT EmprCod, AlbComCod, AlbComSt FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02LZ4", "DELETE FROM TXPLALCOM  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALCOM")
         ,new UpdateCursor("P02LZ5", "DELETE FROM TXPOBSALC  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALC")
         ,new UpdateCursor("P02LZ6", "DELETE FROM TXPCALCOM  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new UpdateCursor("P02LZ7", "UPDATE TXPCALCOM SET AlbComSt=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

