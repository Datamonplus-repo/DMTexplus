package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palmprd extends GXProcedure
{
   public palmprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palmprd.class ), "" );
   }

   public palmprd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      palmprd.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      palmprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palmprd.this.A13927AlmPrdID = aP1[0];
      this.aP1 = aP1;
      palmprd.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8AlmPrdDsc = "" ;
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P09F22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A13927AlmPrdID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13928AlmPrdDsc = P09F22_A13928AlmPrdDsc[0] ;
         AV11GXLvl3 = (byte)(1) ;
         AV8AlmPrdDsc = A13928AlmPrdDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         AV8AlmPrdDsc = ((A13927AlmPrdID>0) ? httpContext.getMessage( "Error.NO existe almacen", "") : " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palmprd.this.A396EmprCod;
      this.aP1[0] = palmprd.this.A13927AlmPrdID;
      this.aP2[0] = palmprd.this.AV8AlmPrdDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8AlmPrdDsc = "" ;
      scmdbuf = "" ;
      P09F22_A396EmprCod = new String[] {""} ;
      P09F22_A13927AlmPrdID = new short[1] ;
      P09F22_A13928AlmPrdDsc = new String[] {""} ;
      A13928AlmPrdDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palmprd__default(),
         new Object[] {
             new Object[] {
            P09F22_A396EmprCod, P09F22_A13927AlmPrdID, P09F22_A13928AlmPrdDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl3 ;
   private short A13927AlmPrdID ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8AlmPrdDsc ;
   private String scmdbuf ;
   private String A13928AlmPrdDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P09F22_A396EmprCod ;
   private short[] P09F22_A13927AlmPrdID ;
   private String[] P09F22_A13928AlmPrdDsc ;
}

final  class palmprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09F22", "SELECT EmprCod, AlmPrdID, AlmPrdDsc FROM TXPALMPRD WHERE EmprCod = ? and AlmPrdID = ? ORDER BY EmprCod, AlmPrdID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

