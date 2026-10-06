package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_atcud extends GXProcedure
{
   public documentotransportecomercial_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_atcud.class ), "" );
   }

   public documentotransportecomercial_atcud( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      documentotransportecomercial_atcud.this.A396EmprCod = aP0;
      documentotransportecomercial_atcud.this.A14AlbComCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AKR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A22AlbComPri = P0AKR2_A22AlbComPri[0] ;
         A14248AlbComATCU = P0AKR2_A14248AlbComATCU[0] ;
         A14249AlbComSerA = P0AKR2_A14249AlbComSerA[0] ;
         A14250AlbComTipA = P0AKR2_A14250AlbComTipA[0] ;
         if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
         {
            AV11ContCod = "100011" ;
         }
         else if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
         {
            AV11ContCod = "100012" ;
         }
         GXv_char1[0] = AV16AlbComATCUD ;
         GXv_char2[0] = AV15AlbComSerAT ;
         GXv_char3[0] = AV17AlbComTipAT ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, AV11ContCod, GXv_char1, GXv_char2, GXv_char3, GXutil.trim( AV21Pgmname)+"."+GXutil.trim( AV22Pgmdesc)) ;
         documentotransportecomercial_atcud.this.AV16AlbComATCUD = GXv_char1[0] ;
         documentotransportecomercial_atcud.this.AV15AlbComSerAT = GXv_char2[0] ;
         documentotransportecomercial_atcud.this.AV17AlbComTipAT = GXv_char3[0] ;
         A14248AlbComATCU = AV16AlbComATCUD ;
         A14249AlbComSerA = AV15AlbComSerAT ;
         A14250AlbComTipA = AV17AlbComTipAT ;
         /* Using cursor P0AKR3 */
         pr_default.execute(1, new Object[] {A14248AlbComATCU, A14249AlbComSerA, A14250AlbComTipA, A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_atcud");
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
      P0AKR2_A396EmprCod = new String[] {""} ;
      P0AKR2_A14AlbComCod = new int[1] ;
      P0AKR2_A22AlbComPri = new String[] {""} ;
      P0AKR2_A14248AlbComATCU = new String[] {""} ;
      P0AKR2_A14249AlbComSerA = new String[] {""} ;
      P0AKR2_A14250AlbComTipA = new String[] {""} ;
      A22AlbComPri = "" ;
      A14248AlbComATCU = "" ;
      A14249AlbComSerA = "" ;
      A14250AlbComTipA = "" ;
      AV11ContCod = "" ;
      AV16AlbComATCUD = "" ;
      GXv_char1 = new String[1] ;
      AV15AlbComSerAT = "" ;
      GXv_char2 = new String[1] ;
      AV17AlbComTipAT = "" ;
      GXv_char3 = new String[1] ;
      AV21Pgmname = "" ;
      AV22Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKR2_A396EmprCod, P0AKR2_A14AlbComCod, P0AKR2_A22AlbComPri, P0AKR2_A14248AlbComATCU, P0AKR2_A14249AlbComSerA, P0AKR2_A14250AlbComTipA
            }
            , new Object[] {
            }
         }
      );
      AV22Pgmdesc = httpContext.getMessage( "Documentotransportecomercial_ATCUD", "") ;
      AV21Pgmname = "DocumentoTransporteComercial.Documentotransportecomercial_ATCUD" ;
      /* GeneXus formulas. */
      AV22Pgmdesc = httpContext.getMessage( "Documentotransportecomercial_ATCUD", "") ;
      AV21Pgmname = "DocumentoTransporteComercial.Documentotransportecomercial_ATCUD" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A22AlbComPri ;
   private String A14248AlbComATCU ;
   private String A14249AlbComSerA ;
   private String A14250AlbComTipA ;
   private String AV11ContCod ;
   private String AV16AlbComATCUD ;
   private String GXv_char1[] ;
   private String AV15AlbComSerAT ;
   private String GXv_char2[] ;
   private String AV17AlbComTipAT ;
   private String GXv_char3[] ;
   private String AV21Pgmname ;
   private String AV22Pgmdesc ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKR2_A396EmprCod ;
   private int[] P0AKR2_A14AlbComCod ;
   private String[] P0AKR2_A22AlbComPri ;
   private String[] P0AKR2_A14248AlbComATCU ;
   private String[] P0AKR2_A14249AlbComSerA ;
   private String[] P0AKR2_A14250AlbComTipA ;
}

final  class documentotransportecomercial_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKR2", "SELECT EmprCod, AlbComCod, AlbComPri, AlbComATCU, AlbComSerA, AlbComTipA FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AKR3", "UPDATE TXPCALCOM SET AlbComATCU=?, AlbComSerA=?, AlbComTipA=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
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
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

