package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psemmalh extends GXProcedure
{
   public psemmalh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psemmalh.class ), "" );
   }

   public psemmalh( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      psemmalh.this.aP1 = new int[] {0};
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
      psemmalh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psemmalh.this.AV8DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P02JS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P02JS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
      /* End optimized DELETE. */
      AV12Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV9Emprnom ;
      GXv_char3[0] = AV10Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      psemmalh.this.A396EmprCod = GXv_char1[0] ;
      psemmalh.this.AV9Emprnom = GXv_char2[0] ;
      psemmalh.this.AV10Usurcod = GXv_char3[0] ;
      /* Using cursor P02JS4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A375DisNumUni = P02JS4_A375DisNumUni[0] ;
         A361DisCod = P02JS4_A361DisCod[0] ;
         AV11DisNumUni = A375DisNumUni ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psemmalh.this.A396EmprCod;
      this.aP1[0] = psemmalh.this.AV8DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "psemmalh");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXv_char1 = new String[1] ;
      AV9Emprnom = "" ;
      GXv_char2 = new String[1] ;
      AV10Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P02JS4_A396EmprCod = new String[] {""} ;
      P02JS4_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02JS4_A361DisCod = new int[1] ;
      A375DisNumUni = DecimalUtil.ZERO ;
      AV11DisNumUni = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psemmalh__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02JS4_A396EmprCod, P02JS4_A375DisNumUni, P02JS4_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8DisCod ;
   private int A361DisCod ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV11DisNumUni ;
   private String A396EmprCod ;
   private String AV12Station ;
   private String GXv_char1[] ;
   private String AV9Emprnom ;
   private String GXv_char2[] ;
   private String AV10Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02JS4_A396EmprCod ;
   private java.math.BigDecimal[] P02JS4_A375DisNumUni ;
   private int[] P02JS4_A361DisCod ;
}

final  class psemmalh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02JS2", "DELETE FROM TXPALBREC  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P02JS3", "DELETE FROM TXPDISALB  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P02JS4", "SELECT EmprCod, DisNumUni, DisCod FROM TXPDISPOS WHERE EmprCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               return;
      }
   }

}

