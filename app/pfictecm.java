package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfictecm extends GXProcedure
{
   public pfictecm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfictecm.class ), "" );
   }

   public pfictecm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pfictecm.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pfictecm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfictecm.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pfictecm.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pfictecm.this.AV8usurcod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P035E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4353ArtUsrCod = P035E2_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = P035E2_n4353ArtUsrCod[0] ;
         A4354ArtFecMod = P035E2_A4354ArtFecMod[0] ;
         n4354ArtFecMod = P035E2_n4354ArtFecMod[0] ;
         A4454ArtLotKgs = P035E2_A4454ArtLotKgs[0] ;
         n4454ArtLotKgs = P035E2_n4454ArtLotKgs[0] ;
         A4353ArtUsrCod = AV8usurcod ;
         n4353ArtUsrCod = false ;
         A4354ArtFecMod = Gx_date ;
         n4354ArtFecMod = false ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A4454ArtLotKgs)==0) && ( ( GXutil.strcmp(GXutil.substring( A65ArtCod, 1, 2), httpContext.getMessage( "BO", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A65ArtCod, 1, 2), httpContext.getMessage( "BC", "")) == 0 ) ) )
         {
            GXv_int1[0] = AV9Num_fic ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FTANUM", ""), GXv_int1) ;
            pfictecm.this.AV9Num_fic = GXv_int1[0] ;
            A4454ArtLotKgs = DecimalUtil.doubleToDec(AV9Num_fic) ;
            n4454ArtLotKgs = false ;
         }
         /* Using cursor P035E3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n4454ArtLotKgs), A4454ArtLotKgs, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfictecm.this.A396EmprCod;
      this.aP1[0] = pfictecm.this.A252CliCod;
      this.aP2[0] = pfictecm.this.A65ArtCod;
      this.aP3[0] = pfictecm.this.AV8usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfictecm");
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
      P035E2_A396EmprCod = new String[] {""} ;
      P035E2_A252CliCod = new int[1] ;
      P035E2_A65ArtCod = new String[] {""} ;
      P035E2_A4353ArtUsrCod = new String[] {""} ;
      P035E2_n4353ArtUsrCod = new boolean[] {false} ;
      P035E2_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P035E2_n4354ArtFecMod = new boolean[] {false} ;
      P035E2_A4454ArtLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035E2_n4454ArtLotKgs = new boolean[] {false} ;
      A4353ArtUsrCod = "" ;
      A4354ArtFecMod = GXutil.nullDate() ;
      A4454ArtLotKgs = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      GXv_int1 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfictecm__default(),
         new Object[] {
             new Object[] {
            P035E2_A396EmprCod, P035E2_A252CliCod, P035E2_A65ArtCod, P035E2_A4353ArtUsrCod, P035E2_n4353ArtUsrCod, P035E2_A4354ArtFecMod, P035E2_n4354ArtFecMod, P035E2_A4454ArtLotKgs, P035E2_n4454ArtLotKgs
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV9Num_fic ;
   private int GXv_int1[] ;
   private java.math.BigDecimal A4454ArtLotKgs ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8usurcod ;
   private String scmdbuf ;
   private String A4353ArtUsrCod ;
   private java.util.Date A4354ArtFecMod ;
   private java.util.Date Gx_date ;
   private boolean n4353ArtUsrCod ;
   private boolean n4354ArtFecMod ;
   private boolean n4454ArtLotKgs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P035E2_A396EmprCod ;
   private int[] P035E2_A252CliCod ;
   private String[] P035E2_A65ArtCod ;
   private String[] P035E2_A4353ArtUsrCod ;
   private boolean[] P035E2_n4353ArtUsrCod ;
   private java.util.Date[] P035E2_A4354ArtFecMod ;
   private boolean[] P035E2_n4354ArtFecMod ;
   private java.math.BigDecimal[] P035E2_A4454ArtLotKgs ;
   private boolean[] P035E2_n4454ArtLotKgs ;
}

final  class pfictecm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P035E2", "SELECT EmprCod, CliCod, ArtCod, ArtUsrCod, ArtFecMod, ArtLotKgs FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P035E3", "UPDATE TXPARTICU SET ArtUsrCod=?, ArtFecMod=?, ArtLotKgs=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               return;
      }
   }

}

