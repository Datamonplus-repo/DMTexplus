package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdibhdr extends GXProcedure
{
   public pdibhdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdibhdr.class ), "" );
   }

   public pdibhdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 )
   {
      pdibhdr.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 )
   {
      pdibhdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdibhdr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdibhdr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdibhdr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdibhdr.this.AV8BarDibCli = aP4[0];
      this.aP4 = aP4;
      pdibhdr.this.AV9BarDibInt = aP5[0];
      this.aP5 = aP5;
      pdibhdr.this.AV10BarCom = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02902 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1798BarDibCli = P02902_A1798BarDibCli[0] ;
         A1799BarDibInt = P02902_A1799BarDibInt[0] ;
         A5033BarCom = P02902_A5033BarCom[0] ;
         AV8BarDibCli = A1798BarDibCli ;
         AV9BarDibInt = A1799BarDibInt ;
         AV10BarCom = A5033BarCom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdibhdr.this.A396EmprCod;
      this.aP1[0] = pdibhdr.this.A129BarCod;
      this.aP2[0] = pdibhdr.this.A132BarCodReo;
      this.aP3[0] = pdibhdr.this.A130BarCodPar;
      this.aP4[0] = pdibhdr.this.AV8BarDibCli;
      this.aP5[0] = pdibhdr.this.AV9BarDibInt;
      this.aP6[0] = pdibhdr.this.AV10BarCom;
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
      P02902_A396EmprCod = new String[] {""} ;
      P02902_A129BarCod = new int[1] ;
      P02902_A132BarCodReo = new byte[1] ;
      P02902_A130BarCodPar = new String[] {""} ;
      P02902_A1798BarDibCli = new String[] {""} ;
      P02902_A1799BarDibInt = new int[1] ;
      P02902_A5033BarCom = new String[] {""} ;
      A1798BarDibCli = "" ;
      A5033BarCom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdibhdr__default(),
         new Object[] {
             new Object[] {
            P02902_A396EmprCod, P02902_A129BarCod, P02902_A132BarCodReo, P02902_A130BarCodPar, P02902_A1798BarDibCli, P02902_A1799BarDibInt, P02902_A5033BarCom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9BarDibInt ;
   private int A1799BarDibInt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarDibCli ;
   private String AV10BarCom ;
   private String scmdbuf ;
   private String A1798BarDibCli ;
   private String A5033BarCom ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02902_A396EmprCod ;
   private int[] P02902_A129BarCod ;
   private byte[] P02902_A132BarCodReo ;
   private String[] P02902_A130BarCodPar ;
   private String[] P02902_A1798BarDibCli ;
   private int[] P02902_A1799BarDibInt ;
   private String[] P02902_A5033BarCom ;
}

final  class pdibhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02902", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDibCli, BarDibInt, BarCom FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

