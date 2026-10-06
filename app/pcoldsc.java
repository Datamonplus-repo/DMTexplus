package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoldsc extends GXProcedure
{
   public pcoldsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoldsc.class ), "" );
   }

   public pcoldsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pcoldsc.this.aP2 = new String[] {""};
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
      pcoldsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoldsc.this.A4811ColCod = aP1[0];
      this.aP1 = aP1;
      pcoldsc.this.AV8ColDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P01CQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A4811ColCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4810ColDsc = P01CQ2_A4810ColDsc[0] ;
         n4810ColDsc = P01CQ2_n4810ColDsc[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8ColDsc = A4810ColDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8ColDsc = httpContext.getMessage( "Color Inexist", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoldsc.this.A396EmprCod;
      this.aP1[0] = pcoldsc.this.A4811ColCod;
      this.aP2[0] = pcoldsc.this.AV8ColDsc;
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
      P01CQ2_A396EmprCod = new String[] {""} ;
      P01CQ2_A4811ColCod = new String[] {""} ;
      P01CQ2_A4810ColDsc = new String[] {""} ;
      P01CQ2_n4810ColDsc = new boolean[] {false} ;
      A4810ColDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoldsc__default(),
         new Object[] {
             new Object[] {
            P01CQ2_A396EmprCod, P01CQ2_A4811ColCod, P01CQ2_A4810ColDsc, P01CQ2_n4810ColDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl1 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A4811ColCod ;
   private String AV8ColDsc ;
   private String scmdbuf ;
   private String A4810ColDsc ;
   private boolean n4810ColDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01CQ2_A396EmprCod ;
   private String[] P01CQ2_A4811ColCod ;
   private String[] P01CQ2_A4810ColDsc ;
   private boolean[] P01CQ2_n4810ColDsc ;
}

final  class pcoldsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01CQ2", "SELECT EmprCod, ColCod, ColDsc FROM TXPJBMCol WHERE EmprCod = ? and ColCod = ? ORDER BY EmprCod, ColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 13);
               return;
      }
   }

}

