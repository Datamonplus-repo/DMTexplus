package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuftdsc extends GXProcedure
{
   public pbuftdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuftdsc.class ), "" );
   }

   public pbuftdsc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pbuftdsc.this.aP2 = new String[] {""};
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
      pbuftdsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuftdsc.this.A1514MacProCod = aP1[0];
      this.aP1 = aP1;
      pbuftdsc.this.AV18MacProDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18MacProDsc = "" ;
      /* Using cursor P024Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1514MacProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1515MacProDsc = P024Q2_A1515MacProDsc[0] ;
         AV18MacProDsc = A1515MacProDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuftdsc.this.A396EmprCod;
      this.aP1[0] = pbuftdsc.this.A1514MacProCod;
      this.aP2[0] = pbuftdsc.this.AV18MacProDsc;
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
      P024Q2_A396EmprCod = new String[] {""} ;
      P024Q2_A1514MacProCod = new String[] {""} ;
      P024Q2_A1515MacProDsc = new String[] {""} ;
      A1515MacProDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuftdsc__default(),
         new Object[] {
             new Object[] {
            P024Q2_A396EmprCod, P024Q2_A1514MacProCod, P024Q2_A1515MacProDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private String AV18MacProDsc ;
   private String scmdbuf ;
   private String A1515MacProDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P024Q2_A396EmprCod ;
   private String[] P024Q2_A1514MacProCod ;
   private String[] P024Q2_A1515MacProDsc ;
}

final  class pbuftdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P024Q2", "SELECT EmprCod, MacProCod, MacProDsc FROM TXPCMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
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

