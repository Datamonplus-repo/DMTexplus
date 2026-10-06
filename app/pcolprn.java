package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcolprn extends GXProcedure
{
   public pcolprn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcolprn.class ), "" );
   }

   public pcolprn( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      pcolprn.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pcolprn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcolprn.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcolprn.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pcolprn.this.A483ForColNum = aP3[0];
      this.aP3 = aP3;
      pcolprn.this.AV11Forblo = aP4[0];
      this.aP4 = aP4;
      pcolprn.this.Gx_msg = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV10Num_c = 0 ;
      /* Using cursor P03522 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, Integer.valueOf(A483ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7781ForBlo = P03522_A7781ForBlo[0] ;
         n7781ForBlo = P03522_n7781ForBlo[0] ;
         A482ForColNom = P03522_A482ForColNom[0] ;
         A831TipColCod = P03522_A831TipColCod[0] ;
         if ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10Num_c = (int)(AV10Num_c+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( AV10Num_c > 1 ) || ( ( AV10Num_c == 1 ) && ( GXutil.strcmp(AV11Forblo, httpContext.getMessage( "S", "")) == 0 ) ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion, el sistema ha detectado que", "") + GXutil.newLine( ) + httpContext.getMessage( "que hay marcados varios colores como principales", "") + GXutil.newLine( ) + httpContext.getMessage( "revise el color ¡¡¡", "") + GXutil.newLine( ) ;
      }
      if ( ( AV10Num_c == 0 ) && ( ( GXutil.strcmp(AV11Forblo, httpContext.getMessage( "N", "")) == 0 ) || ( GXutil.strcmp(AV11Forblo, "*") == 0 ) ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion, el sistema ha detectado que", "") + GXutil.newLine( ) + httpContext.getMessage( "que este color es el PRIMERO y", "") + GXutil.newLine( ) + httpContext.getMessage( "no ha sido marcado como PRINCIPAL ¡¡¡", "") + GXutil.newLine( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcolprn.this.A396EmprCod;
      this.aP1[0] = pcolprn.this.A252CliCod;
      this.aP2[0] = pcolprn.this.A494ForSer;
      this.aP3[0] = pcolprn.this.A483ForColNum;
      this.aP4[0] = pcolprn.this.AV11Forblo;
      this.aP5[0] = pcolprn.this.Gx_msg;
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
      P03522_A396EmprCod = new String[] {""} ;
      P03522_A252CliCod = new int[1] ;
      P03522_A494ForSer = new String[] {""} ;
      P03522_A483ForColNum = new int[1] ;
      P03522_A7781ForBlo = new String[] {""} ;
      P03522_n7781ForBlo = new boolean[] {false} ;
      P03522_A482ForColNom = new String[] {""} ;
      P03522_A831TipColCod = new byte[1] ;
      A7781ForBlo = "" ;
      A482ForColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcolprn__default(),
         new Object[] {
             new Object[] {
            P03522_A396EmprCod, P03522_A252CliCod, P03522_A494ForSer, P03522_A483ForColNum, P03522_A7781ForBlo, P03522_n7781ForBlo, P03522_A482ForColNom, P03522_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV10Num_c ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String AV11Forblo ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A7781ForBlo ;
   private String A482ForColNom ;
   private boolean n7781ForBlo ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03522_A396EmprCod ;
   private int[] P03522_A252CliCod ;
   private String[] P03522_A494ForSer ;
   private int[] P03522_A483ForColNum ;
   private String[] P03522_A7781ForBlo ;
   private boolean[] P03522_n7781ForBlo ;
   private String[] P03522_A482ForColNom ;
   private byte[] P03522_A831TipColCod ;
}

final  class pcolprn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03522", "SELECT EmprCod, CliCod, ForSer, ForColNum, ForBlo, ForColNom, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNum = ? ORDER BY EmprCod, CliCod, ForSer, ForColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

