package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdscprd2 extends GXProcedure
{
   public pdscprd2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdscprd2.class ), "" );
   }

   public pdscprd2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pdscprd2.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pdscprd2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdscprd2.this.A758ProCod = aP1[0];
      this.aP1 = aP1;
      pdscprd2.this.AV8ProDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ProDsc = " " ;
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P01PK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4628ProDsc2 = P01PK2_A4628ProDsc2[0] ;
         A759ProDsc = P01PK2_A759ProDsc[0] ;
         AV11GXLvl3 = (byte)(1) ;
         if ( GXutil.strcmp(A4628ProDsc2, " ") != 0 )
         {
            AV8ProDsc = A4628ProDsc2 ;
         }
         else
         {
            AV8ProDsc = A759ProDsc ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         AV8ProDsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdscprd2.this.A396EmprCod;
      this.aP1[0] = pdscprd2.this.A758ProCod;
      this.aP2[0] = pdscprd2.this.AV8ProDsc;
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
      P01PK2_A396EmprCod = new String[] {""} ;
      P01PK2_A758ProCod = new String[] {""} ;
      P01PK2_A4628ProDsc2 = new String[] {""} ;
      P01PK2_A759ProDsc = new String[] {""} ;
      A4628ProDsc2 = "" ;
      A759ProDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdscprd2__default(),
         new Object[] {
             new Object[] {
            P01PK2_A396EmprCod, P01PK2_A758ProCod, P01PK2_A4628ProDsc2, P01PK2_A759ProDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV8ProDsc ;
   private String scmdbuf ;
   private String A4628ProDsc2 ;
   private String A759ProDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01PK2_A396EmprCod ;
   private String[] P01PK2_A758ProCod ;
   private String[] P01PK2_A4628ProDsc2 ;
   private String[] P01PK2_A759ProDsc ;
}

final  class pdscprd2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PK2", "SELECT EmprCod, ProCod, ProDsc2, ProDsc FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
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

