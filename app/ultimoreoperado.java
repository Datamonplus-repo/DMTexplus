package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ultimoreoperado extends GXProcedure
{
   public ultimoreoperado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ultimoreoperado.class ), "" );
   }

   public ultimoreoperado( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      ultimoreoperado.this.aP3 = new byte[] {0};
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
      ultimoreoperado.this.AV9EmprCod = aP0[0];
      this.aP0 = aP0;
      ultimoreoperado.this.AV10BarCod = aP1[0];
      this.aP1 = aP1;
      ultimoreoperado.this.AV11BarCodPar = aP2[0];
      this.aP2 = aP2;
      ultimoreoperado.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Barconreo = (byte)(0) ;
      /* Using cursor P08842 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV10BarCod), AV11BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P08842_A130BarCodPar[0] ;
         A132BarCodReo = P08842_A132BarCodReo[0] ;
         A129BarCod = P08842_A129BarCod[0] ;
         A396EmprCod = P08842_A396EmprCod[0] ;
         A138BarConReo = P08842_A138BarConReo[0] ;
         AV8Barconreo = A138BarConReo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ultimoreoperado.this.AV9EmprCod;
      this.aP1[0] = ultimoreoperado.this.AV10BarCod;
      this.aP2[0] = ultimoreoperado.this.AV11BarCodPar;
      this.aP3[0] = ultimoreoperado.this.AV8Barconreo;
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
      P08842_A130BarCodPar = new String[] {""} ;
      P08842_A132BarCodReo = new byte[1] ;
      P08842_A129BarCod = new int[1] ;
      P08842_A396EmprCod = new String[] {""} ;
      P08842_A138BarConReo = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ultimoreoperado__default(),
         new Object[] {
             new Object[] {
            P08842_A130BarCodPar, P08842_A132BarCodReo, P08842_A129BarCod, P08842_A396EmprCod, P08842_A138BarConReo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Barconreo ;
   private byte A132BarCodReo ;
   private byte A138BarConReo ;
   private short Gx_err ;
   private int AV10BarCod ;
   private int A129BarCod ;
   private String AV9EmprCod ;
   private String AV11BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P08842_A130BarCodPar ;
   private byte[] P08842_A132BarCodReo ;
   private int[] P08842_A129BarCod ;
   private String[] P08842_A396EmprCod ;
   private byte[] P08842_A138BarConReo ;
}

final  class ultimoreoperado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08842", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarConReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

