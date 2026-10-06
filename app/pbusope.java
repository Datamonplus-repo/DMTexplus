package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusope extends GXProcedure
{
   public pbusope( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusope.class ), "" );
   }

   public pbusope( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pbusope.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pbusope.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusope.this.AV8OpeCod = aP1[0];
      this.aP1 = aP1;
      pbusope.this.AV9OpeNOm = aP2[0];
      this.aP2 = aP2;
      pbusope.this.AV10Flag = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Flag = (byte)(0) ;
      /* Using cursor P01492 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8OpeCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A652OpeCod = P01492_A652OpeCod[0] ;
         A2505OpePreHor = P01492_A2505OpePreHor[0] ;
         n2505OpePreHor = P01492_n2505OpePreHor[0] ;
         A653OpeNom = P01492_A653OpeNom[0] ;
         n653OpeNom = P01492_n653OpeNom[0] ;
         AV9OpeNOm = A653OpeNom ;
         AV10Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusope.this.A396EmprCod;
      this.aP1[0] = pbusope.this.AV8OpeCod;
      this.aP2[0] = pbusope.this.AV9OpeNOm;
      this.aP3[0] = pbusope.this.AV10Flag;
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
      P01492_A396EmprCod = new String[] {""} ;
      P01492_A652OpeCod = new int[1] ;
      P01492_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01492_n2505OpePreHor = new boolean[] {false} ;
      P01492_A653OpeNom = new String[] {""} ;
      P01492_n653OpeNom = new boolean[] {false} ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      A653OpeNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusope__default(),
         new Object[] {
             new Object[] {
            P01492_A396EmprCod, P01492_A652OpeCod, P01492_A2505OpePreHor, P01492_n2505OpePreHor, P01492_A653OpeNom, P01492_n653OpeNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Flag ;
   private short Gx_err ;
   private int AV8OpeCod ;
   private int A652OpeCod ;
   private java.math.BigDecimal A2505OpePreHor ;
   private String A396EmprCod ;
   private String AV9OpeNOm ;
   private String scmdbuf ;
   private String A653OpeNom ;
   private boolean n2505OpePreHor ;
   private boolean n653OpeNom ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01492_A396EmprCod ;
   private int[] P01492_A652OpeCod ;
   private java.math.BigDecimal[] P01492_A2505OpePreHor ;
   private boolean[] P01492_n2505OpePreHor ;
   private String[] P01492_A653OpeNom ;
   private boolean[] P01492_n653OpeNom ;
}

final  class pbusope__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01492", "SELECT EmprCod, OpeCod, OpePreHor, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

