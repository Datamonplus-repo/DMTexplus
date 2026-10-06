package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plotectrl extends GXProcedure
{
   public plotectrl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plotectrl.class ), "" );
   }

   public plotectrl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      plotectrl.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      plotectrl.this.A396EmprCod = aP0;
      plotectrl.this.A719PrdNum = aP1;
      plotectrl.this.A11664LoteID = aP2;
      plotectrl.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ok = httpContext.getMessage( "N", "") ;
      /* Using cursor P04SC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11665LoteFec = P04SC2_A11665LoteFec[0] ;
         AV8ok = httpContext.getMessage( "S", "") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "&ok=", "")+AV8ok );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = plotectrl.this.AV8ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ok = "" ;
      scmdbuf = "" ;
      P04SC2_A396EmprCod = new String[] {""} ;
      P04SC2_A719PrdNum = new String[] {""} ;
      P04SC2_A11664LoteID = new String[] {""} ;
      P04SC2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      A11665LoteFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plotectrl__default(),
         new Object[] {
             new Object[] {
            P04SC2_A396EmprCod, P04SC2_A719PrdNum, P04SC2_A11664LoteID, P04SC2_A11665LoteFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A11664LoteID ;
   private String AV8ok ;
   private String scmdbuf ;
   private java.util.Date A11665LoteFec ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04SC2_A396EmprCod ;
   private String[] P04SC2_A719PrdNum ;
   private String[] P04SC2_A11664LoteID ;
   private java.util.Date[] P04SC2_A11665LoteFec ;
}

final  class plotectrl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04SC2", "SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? and PrdNum = ? and LoteID = ? ORDER BY EmprCod, PrdNum, LoteID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
               stmt.setString(3, (String)parms[2], 26);
               return;
      }
   }

}

