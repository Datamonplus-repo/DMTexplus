package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class haydatosturnolhipro extends GXProcedure
{
   public haydatosturnolhipro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( haydatosturnolhipro.class ), "" );
   }

   public haydatosturnolhipro( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            byte aP1 )
   {
      haydatosturnolhipro.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             short[] aP2 )
   {
      haydatosturnolhipro.this.A396EmprCod = aP0;
      haydatosturnolhipro.this.A566HisProTur = aP1;
      haydatosturnolhipro.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Haydatos = (short)(0) ;
      /* Using cursor P0A2Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A566HisProTur)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4440HisProDTI = P0A2Z2_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A2Z2_n4440HisProDTI[0] ;
         A602MaqCod = P0A2Z2_A602MaqCod[0] ;
         A558HisProFec = P0A2Z2_A558HisProFec[0] ;
         A561HisProLin = P0A2Z2_A561HisProLin[0] ;
         AV8Haydatos = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = haydatosturnolhipro.this.AV8Haydatos;
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
      P0A2Z2_A396EmprCod = new String[] {""} ;
      P0A2Z2_A566HisProTur = new byte[1] ;
      P0A2Z2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A2Z2_n4440HisProDTI = new boolean[] {false} ;
      P0A2Z2_A602MaqCod = new String[] {""} ;
      P0A2Z2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A2Z2_A561HisProLin = new int[1] ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.haydatosturnolhipro__default(),
         new Object[] {
             new Object[] {
            P0A2Z2_A396EmprCod, P0A2Z2_A566HisProTur, P0A2Z2_A4440HisProDTI, P0A2Z2_n4440HisProDTI, P0A2Z2_A602MaqCod, P0A2Z2_A558HisProFec, P0A2Z2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A566HisProTur ;
   private short AV8Haydatos ;
   private short Gx_err ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean n4440HisProDTI ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A2Z2_A396EmprCod ;
   private byte[] P0A2Z2_A566HisProTur ;
   private java.util.Date[] P0A2Z2_A4440HisProDTI ;
   private boolean[] P0A2Z2_n4440HisProDTI ;
   private String[] P0A2Z2_A602MaqCod ;
   private java.util.Date[] P0A2Z2_A558HisProFec ;
   private int[] P0A2Z2_A561HisProLin ;
}

final  class haydatosturnolhipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2Z2", "SELECT * FROM (SELECT EmprCod, HisProTur, HisProDTI, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and HisProTur = ? ORDER BY EmprCod, HisProTur) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

