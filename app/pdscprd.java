package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdscprd extends GXProcedure
{
   public pdscprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdscprd.class ), "" );
   }

   public pdscprd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pdscprd.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      pdscprd.this.A396EmprCod = aP0;
      pdscprd.this.A758ProCod = aP1;
      pdscprd.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ProDsc = GXutil.space( (short)(40)) ;
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P01AY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A759ProDsc = P01AY2_A759ProDsc[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8ProDsc = A759ProDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8ProDsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pdscprd.this.AV8ProDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ProDsc = "" ;
      scmdbuf = "" ;
      P01AY2_A396EmprCod = new String[] {""} ;
      P01AY2_A758ProCod = new String[] {""} ;
      P01AY2_A759ProDsc = new String[] {""} ;
      A759ProDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdscprd__default(),
         new Object[] {
             new Object[] {
            P01AY2_A396EmprCod, P01AY2_A758ProCod, P01AY2_A759ProDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV8ProDsc ;
   private String scmdbuf ;
   private String A759ProDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01AY2_A396EmprCod ;
   private String[] P01AY2_A758ProCod ;
   private String[] P01AY2_A759ProDsc ;
}

final  class pdscprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AY2", "SELECT EmprCod, ProCod, ProDsc FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

