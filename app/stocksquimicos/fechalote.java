package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class fechalote extends GXProcedure
{
   public fechalote( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( fechalote.class ), "" );
   }

   public fechalote( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     String aP1 ,
                                     String aP2 )
   {
      fechalote.this.aP3 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date[] aP3 )
   {
      fechalote.this.A396EmprCod = aP0;
      fechalote.this.A719PrdNum = aP1;
      fechalote.this.A11664LoteID = aP2;
      fechalote.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8lotefec = GXutil.nullDate() ;
      /* Using cursor P0AEI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11665LoteFec = P0AEI2_A11665LoteFec[0] ;
         AV8lotefec = A11665LoteFec ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = fechalote.this.AV8lotefec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8lotefec = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0AEI2_A396EmprCod = new String[] {""} ;
      P0AEI2_A719PrdNum = new String[] {""} ;
      P0AEI2_A11664LoteID = new String[] {""} ;
      P0AEI2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      A11665LoteFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.fechalote__default(),
         new Object[] {
             new Object[] {
            P0AEI2_A396EmprCod, P0AEI2_A719PrdNum, P0AEI2_A11664LoteID, P0AEI2_A11665LoteFec
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
   private String scmdbuf ;
   private java.util.Date AV8lotefec ;
   private java.util.Date A11665LoteFec ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEI2_A396EmprCod ;
   private String[] P0AEI2_A719PrdNum ;
   private String[] P0AEI2_A11664LoteID ;
   private java.util.Date[] P0AEI2_A11665LoteFec ;
}

final  class fechalote__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEI2", "SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? and PrdNum = ? and LoteID = ? ORDER BY EmprCod, PrdNum, LoteID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

