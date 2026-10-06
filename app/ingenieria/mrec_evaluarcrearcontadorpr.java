package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_evaluarcrearcontadorpr extends GXProcedure
{
   public mrec_evaluarcrearcontadorpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_evaluarcrearcontadorpr.class ), "" );
   }

   public mrec_evaluarcrearcontadorpr( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String aP1 )
   {
      mrec_evaluarcrearcontadorpr.this.AV8EmprCod = aP0;
      mrec_evaluarcrearcontadorpr.this.AV9ContCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl1 = (byte)(0) ;
      /* Using cursor P09U22 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV9ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P09U22_A313ContCod[0] ;
         A396EmprCod = P09U22_A396EmprCod[0] ;
         AV13GXLvl1 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV13GXLvl1 == 0 )
      {
         AV10ContVal = 0 ;
         GXv_int1[0] = AV10ContVal ;
         new app.ingenieria.mrec_emplin_parametro_ingsim(remoteHandle, context).execute( "UPD", AV8EmprCod, AV9ContCod, GXv_int1) ;
         mrec_evaluarcrearcontadorpr.this.AV10ContVal = GXv_int1[0] ;
         new app.ingenieria.mrec_evaluarpararpr(remoteHandle, context).execute( AV8EmprCod, AV9ContCod) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
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
      P09U22_A313ContCod = new String[] {""} ;
      P09U22_A396EmprCod = new String[] {""} ;
      A313ContCod = "" ;
      A396EmprCod = "" ;
      GXv_int1 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_evaluarcrearcontadorpr__default(),
         new Object[] {
             new Object[] {
            P09U22_A313ContCod, P09U22_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13GXLvl1 ;
   private short Gx_err ;
   private int AV10ContVal ;
   private int GXv_int1[] ;
   private String AV8EmprCod ;
   private String AV9ContCod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private String[] P09U22_A313ContCod ;
   private String[] P09U22_A396EmprCod ;
}

final  class mrec_evaluarcrearcontadorpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09U22", "SELECT ContCod, EmprCod FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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

