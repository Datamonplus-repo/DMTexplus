package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pleocon extends GXProcedure
{
   public pleocon( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pleocon.class ), "" );
   }

   public pleocon( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pleocon.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pleocon.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pleocon.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      pleocon.this.AV16ContVal = aP2[0];
      this.aP2 = aP2;
      pleocon.this.AV15ContDsc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00OO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A316ContVal = P00OO2_A316ContVal[0] ;
         A314ContDsc = P00OO2_A314ContDsc[0] ;
         AV16ContVal = A316ContVal ;
         AV15ContDsc = A314ContDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pleocon.this.A396EmprCod;
      this.aP1[0] = pleocon.this.A313ContCod;
      this.aP2[0] = pleocon.this.AV16ContVal;
      this.aP3[0] = pleocon.this.AV15ContDsc;
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
      P00OO2_A396EmprCod = new String[] {""} ;
      P00OO2_A313ContCod = new String[] {""} ;
      P00OO2_A316ContVal = new int[1] ;
      P00OO2_A314ContDsc = new String[] {""} ;
      A314ContDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pleocon__default(),
         new Object[] {
             new Object[] {
            P00OO2_A396EmprCod, P00OO2_A313ContCod, P00OO2_A316ContVal, P00OO2_A314ContDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16ContVal ;
   private int A316ContVal ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String AV15ContDsc ;
   private String scmdbuf ;
   private String A314ContDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00OO2_A396EmprCod ;
   private String[] P00OO2_A313ContCod ;
   private int[] P00OO2_A316ContVal ;
   private String[] P00OO2_A314ContDsc ;
}

final  class pleocon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00OO2", "SELECT EmprCod, ContCod, ContVal, ContDsc FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
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

