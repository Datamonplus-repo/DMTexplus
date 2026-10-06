package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patcud extends GXProcedure
{
   public patcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patcud.class ), "" );
   }

   public patcud( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String aP5 )
   {
      patcud.this.A396EmprCod = aP0;
      patcud.this.A313ContCod = aP1;
      patcud.this.aP2 = aP2;
      patcud.this.aP3 = aP3;
      patcud.this.aP4 = aP4;
      patcud.this.AV15ProgramaIN = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      patcud.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char4[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      patcud.this.A396EmprCod = GXv_char2[0] ;
      patcud.this.AV12EmprNom = GXv_char3[0] ;
      patcud.this.AV13UsurCod = GXv_char4[0] ;
      AV10ContDoc = "" ;
      AV8ContIDSerie = "" ;
      AV9ContIDSerNew = "" ;
      AV11inc_obs = " " ;
      AV18GXLvl14 = (byte)(0) ;
      /* Using cursor P09SM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14184ContAplica = P09SM2_A14184ContAplica[0] ;
         n14184ContAplica = P09SM2_n14184ContAplica[0] ;
         A14177ContATEst = P09SM2_A14177ContATEst[0] ;
         n14177ContATEst = P09SM2_n14177ContATEst[0] ;
         A14173ContATCod = P09SM2_A14173ContATCod[0] ;
         n14173ContATCod = P09SM2_n14173ContATCod[0] ;
         A14181ContIDSerN = P09SM2_A14181ContIDSerN[0] ;
         n14181ContIDSerN = P09SM2_n14181ContIDSerN[0] ;
         A14172ContDoc = P09SM2_A14172ContDoc[0] ;
         n14172ContDoc = P09SM2_n14172ContDoc[0] ;
         AV18GXLvl14 = (byte)(1) ;
         if ( ( GXutil.strcmp(A14177ContATEst, httpContext.getMessage( "A", "")) == 0 ) && ( A14184ContAplica == 1 ) )
         {
            AV8ContIDSerie = GXutil.trim( A14173ContATCod) ;
            AV9ContIDSerNew = A14181ContIDSerN ;
            AV10ContDoc = A14172ContDoc ;
         }
         AV11inc_obs = httpContext.getMessage( "ContCod=", "") + A313ContCod ;
         AV11inc_obs += httpContext.getMessage( "/&ContIDSerie=", "") + GXutil.trim( AV8ContIDSerie) + httpContext.getMessage( "/&ContIDSerNew=", "") + GXutil.trim( AV9ContIDSerNew) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl14 == 0 )
      {
         AV11inc_obs = httpContext.getMessage( "NO existe registro para el codigo ", "") + A313ContCod ;
      }
      if ( GXutil.strcmp(AV11inc_obs, " ") != 0 )
      {
         AV11inc_obs += httpContext.getMessage( "/Programa from=", "") + GXutil.trim( AV15ProgramaIN) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV19Pgmname, AV13UsurCod, AV14Station, AV11inc_obs, 12345678, (byte)(0), " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = patcud.this.AV8ContIDSerie;
      this.aP3[0] = patcud.this.AV9ContIDSerNew;
      this.aP4[0] = patcud.this.AV10ContDoc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ContIDSerie = "" ;
      AV9ContIDSerNew = "" ;
      AV10ContDoc = "" ;
      AV14Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV12EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV13UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV11inc_obs = "" ;
      scmdbuf = "" ;
      P09SM2_A396EmprCod = new String[] {""} ;
      P09SM2_A313ContCod = new String[] {""} ;
      P09SM2_A14184ContAplica = new byte[1] ;
      P09SM2_n14184ContAplica = new boolean[] {false} ;
      P09SM2_A14177ContATEst = new String[] {""} ;
      P09SM2_n14177ContATEst = new boolean[] {false} ;
      P09SM2_A14173ContATCod = new String[] {""} ;
      P09SM2_n14173ContATCod = new boolean[] {false} ;
      P09SM2_A14181ContIDSerN = new String[] {""} ;
      P09SM2_n14181ContIDSerN = new boolean[] {false} ;
      P09SM2_A14172ContDoc = new String[] {""} ;
      P09SM2_n14172ContDoc = new boolean[] {false} ;
      A14177ContATEst = "" ;
      A14173ContATCod = "" ;
      A14181ContIDSerN = "" ;
      A14172ContDoc = "" ;
      AV19Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.patcud__default(),
         new Object[] {
             new Object[] {
            P09SM2_A396EmprCod, P09SM2_A313ContCod, P09SM2_A14184ContAplica, P09SM2_n14184ContAplica, P09SM2_A14177ContATEst, P09SM2_n14177ContATEst, P09SM2_A14173ContATCod, P09SM2_n14173ContATCod, P09SM2_A14181ContIDSerN, P09SM2_n14181ContIDSerN,
            P09SM2_A14172ContDoc, P09SM2_n14172ContDoc
            }
         }
      );
      AV19Pgmname = "Patcud" ;
      /* GeneXus formulas. */
      AV19Pgmname = "Patcud" ;
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl14 ;
   private byte A14184ContAplica ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String AV8ContIDSerie ;
   private String AV9ContIDSerNew ;
   private String AV10ContDoc ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV12EmprNom ;
   private String GXv_char3[] ;
   private String AV13UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A14177ContATEst ;
   private String A14173ContATCod ;
   private String A14181ContIDSerN ;
   private String A14172ContDoc ;
   private String AV19Pgmname ;
   private boolean n14184ContAplica ;
   private boolean n14177ContATEst ;
   private boolean n14173ContATCod ;
   private boolean n14181ContIDSerN ;
   private boolean n14172ContDoc ;
   private String AV15ProgramaIN ;
   private String AV11inc_obs ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09SM2_A396EmprCod ;
   private String[] P09SM2_A313ContCod ;
   private byte[] P09SM2_A14184ContAplica ;
   private boolean[] P09SM2_n14184ContAplica ;
   private String[] P09SM2_A14177ContATEst ;
   private boolean[] P09SM2_n14177ContATEst ;
   private String[] P09SM2_A14173ContATCod ;
   private boolean[] P09SM2_n14173ContATCod ;
   private String[] P09SM2_A14181ContIDSerN ;
   private boolean[] P09SM2_n14181ContIDSerN ;
   private String[] P09SM2_A14172ContDoc ;
   private boolean[] P09SM2_n14172ContDoc ;
}

final  class patcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SM2", "SELECT EmprCod, ContCod, ContAplica, ContATEst, ContATCod, ContIDSerN, ContDoc FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
      }
   }

}

