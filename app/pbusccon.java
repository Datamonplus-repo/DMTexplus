package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusccon extends GXProcedure
{
   public pbusccon( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusccon.class ), "" );
   }

   public pbusccon( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pbusccon.this.aP2 = new String[] {""};
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
      pbusccon.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusccon.this.A4213ConCCod = aP1[0];
      this.aP1 = aP1;
      pbusccon.this.AV8ConCDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01692 */
      pr_default.execute(0, new Object[] {A396EmprCod, A4213ConCCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4214ConCDsc = P01692_A4214ConCDsc[0] ;
         n4214ConCDsc = P01692_n4214ConCDsc[0] ;
         AV8ConCDsc = A4214ConCDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusccon.this.A396EmprCod;
      this.aP1[0] = pbusccon.this.A4213ConCCod;
      this.aP2[0] = pbusccon.this.AV8ConCDsc;
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
      P01692_A396EmprCod = new String[] {""} ;
      P01692_A4213ConCCod = new String[] {""} ;
      P01692_A4214ConCDsc = new String[] {""} ;
      P01692_n4214ConCDsc = new boolean[] {false} ;
      A4214ConCDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusccon__default(),
         new Object[] {
             new Object[] {
            P01692_A396EmprCod, P01692_A4213ConCCod, P01692_A4214ConCDsc, P01692_n4214ConCDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A4213ConCCod ;
   private String AV8ConCDsc ;
   private String scmdbuf ;
   private String A4214ConCDsc ;
   private boolean n4214ConCDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01692_A396EmprCod ;
   private String[] P01692_A4213ConCCod ;
   private String[] P01692_A4214ConCDsc ;
   private boolean[] P01692_n4214ConCDsc ;
}

final  class pbusccon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01692", "SELECT EmprCod, ConCCod, ConCDsc FROM TXPConCom WHERE EmprCod = ? and ConCCod = ? ORDER BY EmprCod, ConCCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
               stmt.setString(2, (String)parms[1], 1);
               return;
      }
   }

}

