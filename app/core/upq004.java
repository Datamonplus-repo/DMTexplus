package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upq004 extends GXProcedure
{
   public upq004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq004.class ), "" );
   }

   public upq004( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      upq004.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      upq004.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      upq004.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8UsurCod = " " ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      upq004.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      upq004.this.AV10EmprCod = GXv_char2[0] ;
      upq004.this.AV11EmprNom = GXv_char3[0] ;
      upq004.this.AV8UsurCod = GXv_char4[0] ;
      AV13Inc_obs = "" ;
      /* Using cursor P09472 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A718PrdNom = P09472_A718PrdNom[0] ;
         A704PrdExiAlm = P09472_A704PrdExiAlm[0] ;
         AV12PrdExialm = DecimalUtil.ZERO ;
         /* Optimized group. */
         /* Using cursor P09473 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
         c419EntUniRem = P09473_A419EntUniRem[0] ;
         pr_default.close(1);
         AV12PrdExialm = AV12PrdExialm.add(c419EntUniRem) ;
         /* End optimized group. */
         AV13Inc_obs = httpContext.getMessage( "Act Prdexialm,NO se hizo en Pupq002, ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Existencias ", "") + GXutil.trim( GXutil.str( A704PrdExiAlm, 12, 4)) + httpContext.getMessage( " se cambia por ", "") + GXutil.trim( GXutil.str( AV12PrdExialm, 12, 4)) ;
         A704PrdExiAlm = AV12PrdExialm ;
         /* Using cursor P09474 */
         pr_default.execute(2, new Object[] {A704PrdExiAlm, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV13Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmname, AV8UsurCod, AV9Station, AV13Inc_obs, 99999999, (byte)(0), " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = upq004.this.A396EmprCod;
      this.aP1[0] = upq004.this.A719PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "core.upq004");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      GXt_char1 = "" ;
      AV10EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV13Inc_obs = "" ;
      scmdbuf = "" ;
      P09472_A396EmprCod = new String[] {""} ;
      P09472_A719PrdNum = new String[] {""} ;
      P09472_A718PrdNom = new String[] {""} ;
      P09472_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      AV12PrdExialm = DecimalUtil.ZERO ;
      c419EntUniRem = DecimalUtil.ZERO ;
      P09473_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV18Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.upq004__default(),
         new Object[] {
             new Object[] {
            P09472_A396EmprCod, P09472_A719PrdNum, P09472_A718PrdNom, P09472_A704PrdExiAlm
            }
            , new Object[] {
            P09473_A419EntUniRem
            }
            , new Object[] {
            }
         }
      );
      AV18Pgmname = "Core.UPQ004" ;
      /* GeneXus formulas. */
      AV18Pgmname = "Core.UPQ004" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV12PrdExialm ;
   private java.math.BigDecimal c419EntUniRem ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String GXt_char1 ;
   private String AV10EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String AV18Pgmname ;
   private String AV13Inc_obs ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09472_A396EmprCod ;
   private String[] P09472_A719PrdNum ;
   private String[] P09472_A718PrdNom ;
   private java.math.BigDecimal[] P09472_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09473_A419EntUniRem ;
}

final  class upq004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09472", "SELECT EmprCod, PrdNum, PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09473", "SELECT SUM(EntUniRem) FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09474", "UPDATE TXPPRODUC SET PrdExiAlm=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

