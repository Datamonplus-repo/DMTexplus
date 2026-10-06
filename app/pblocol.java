package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pblocol extends GXProcedure
{
   public pblocol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pblocol.class ), "" );
   }

   public pblocol( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pblocol.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pblocol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pblocol.this.A486ForNumCol = aP1[0];
      this.aP1 = aP1;
      pblocol.this.AV10Forblo = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Aplicando cambio en item Bloqueo...", "") );
      /* Using cursor P03HP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7781ForBlo = P03HP2_A7781ForBlo[0] ;
         n7781ForBlo = P03HP2_n7781ForBlo[0] ;
         A831TipColCod = P03HP2_A831TipColCod[0] ;
         A483ForColNum = P03HP2_A483ForColNum[0] ;
         A482ForColNom = P03HP2_A482ForColNom[0] ;
         A494ForSer = P03HP2_A494ForSer[0] ;
         A252CliCod = P03HP2_A252CliCod[0] ;
         A7781ForBlo = AV10Forblo ;
         n7781ForBlo = false ;
         Gx_msg = httpContext.getMessage( "Color actualizado...", "") + GXutil.str( A252CliCod, 6, 0) + A494ForSer + A482ForColNom + GXutil.str( A483ForColNum, 6, 0) + GXutil.str( A831TipColCod, 2, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P03HP3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7781ForBlo), A7781ForBlo, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pblocol.this.A396EmprCod;
      this.aP1[0] = pblocol.this.A486ForNumCol;
      this.aP2[0] = pblocol.this.AV10Forblo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pblocol");
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
      P03HP2_A396EmprCod = new String[] {""} ;
      P03HP2_A486ForNumCol = new int[1] ;
      P03HP2_A7781ForBlo = new String[] {""} ;
      P03HP2_n7781ForBlo = new boolean[] {false} ;
      P03HP2_A831TipColCod = new byte[1] ;
      P03HP2_A483ForColNum = new int[1] ;
      P03HP2_A482ForColNom = new String[] {""} ;
      P03HP2_A494ForSer = new String[] {""} ;
      P03HP2_A252CliCod = new int[1] ;
      A7781ForBlo = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pblocol__default(),
         new Object[] {
             new Object[] {
            P03HP2_A396EmprCod, P03HP2_A486ForNumCol, P03HP2_A7781ForBlo, P03HP2_n7781ForBlo, P03HP2_A831TipColCod, P03HP2_A483ForColNum, P03HP2_A482ForColNom, P03HP2_A494ForSer, P03HP2_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int A486ForNumCol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV10Forblo ;
   private String scmdbuf ;
   private String A7781ForBlo ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String Gx_msg ;
   private boolean n7781ForBlo ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03HP2_A396EmprCod ;
   private int[] P03HP2_A486ForNumCol ;
   private String[] P03HP2_A7781ForBlo ;
   private boolean[] P03HP2_n7781ForBlo ;
   private byte[] P03HP2_A831TipColCod ;
   private int[] P03HP2_A483ForColNum ;
   private String[] P03HP2_A482ForColNom ;
   private String[] P03HP2_A494ForSer ;
   private int[] P03HP2_A252CliCod ;
}

final  class pblocol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03HP2", "SELECT EmprCod, ForNumCol, ForBlo, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03HP3", "UPDATE TXPCFORMU SET ForBlo=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
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
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

