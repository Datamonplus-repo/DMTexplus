package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscolk extends GXProcedure
{
   public pbuscolk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscolk.class ), "" );
   }

   public pbuscolk( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pbuscolk.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pbuscolk.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuscolk.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbuscolk.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pbuscolk.this.AV8ForNomCli = aP3[0];
      this.aP3 = aP3;
      pbuscolk.this.AV9ForNumCli = aP4[0];
      this.aP4 = aP4;
      pbuscolk.this.AV10ForColNom = aP5[0];
      this.aP5 = aP5;
      pbuscolk.this.AV11ForColNum = aP6[0];
      this.aP6 = aP6;
      pbuscolk.this.AV12TipColCod = aP7[0];
      this.aP7 = aP7;
      pbuscolk.this.Gx_msg = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV14Kohler ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int2) ;
      pbuscolk.this.GXt_int1 = GXv_int2[0] ;
      AV14Kohler = GXt_int1 ;
      AV10ForColNom = " " ;
      AV8ForNomCli = " " ;
      AV12TipColCod = (byte)(0) ;
      Gx_msg = " " ;
      AV15Fornumclii = AV9ForNumCli ;
      AV16Forcolnumi = AV11ForColNum ;
      if ( AV15Fornumclii > 0 )
      {
         /* Using cursor P02D02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, Integer.valueOf(AV15Fornumclii)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1192ForNumCli = P02D02_A1192ForNumCli[0] ;
            n1192ForNumCli = P02D02_n1192ForNumCli[0] ;
            A482ForColNom = P02D02_A482ForColNom[0] ;
            A483ForColNum = P02D02_A483ForColNum[0] ;
            A1191ForNomCli = P02D02_A1191ForNomCli[0] ;
            n1191ForNomCli = P02D02_n1191ForNomCli[0] ;
            A831TipColCod = P02D02_A831TipColCod[0] ;
            AV10ForColNom = A482ForColNom ;
            AV11ForColNum = A483ForColNum ;
            AV8ForNomCli = A1191ForNomCli ;
            AV12TipColCod = A831TipColCod ;
            Gx_msg = httpContext.getMessage( "OK", "") ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( AV16Forcolnumi > 0 )
      {
         /* Using cursor P02D03 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, Integer.valueOf(AV16Forcolnumi)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A483ForColNum = P02D03_A483ForColNum[0] ;
            A9792For_Reo = P02D03_A9792For_Reo[0] ;
            n9792For_Reo = P02D03_n9792For_Reo[0] ;
            A482ForColNom = P02D03_A482ForColNom[0] ;
            A1192ForNumCli = P02D03_A1192ForNumCli[0] ;
            n1192ForNumCli = P02D03_n1192ForNumCli[0] ;
            A1191ForNomCli = P02D03_A1191ForNomCli[0] ;
            n1191ForNomCli = P02D03_n1191ForNomCli[0] ;
            A831TipColCod = P02D03_A831TipColCod[0] ;
            if ( GXutil.strcmp(A9792For_Reo, httpContext.getMessage( "S", "")) == 0 )
            {
            }
            else
            {
               AV10ForColNom = A482ForColNom ;
               AV9ForNumCli = A1192ForNumCli ;
               AV8ForNomCli = A1191ForNomCli ;
               AV12TipColCod = A831TipColCod ;
               Gx_msg = httpContext.getMessage( "OK", "") ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( ( AV14Kohler == 1 ) && ( GXutil.strcmp(Gx_msg, " ") == 0 ) )
      {
         AV11ForColNum = AV9ForNumCli ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscolk.this.A396EmprCod;
      this.aP1[0] = pbuscolk.this.A252CliCod;
      this.aP2[0] = pbuscolk.this.A494ForSer;
      this.aP3[0] = pbuscolk.this.AV8ForNomCli;
      this.aP4[0] = pbuscolk.this.AV9ForNumCli;
      this.aP5[0] = pbuscolk.this.AV10ForColNom;
      this.aP6[0] = pbuscolk.this.AV11ForColNum;
      this.aP7[0] = pbuscolk.this.AV12TipColCod;
      this.aP8[0] = pbuscolk.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P02D02_A396EmprCod = new String[] {""} ;
      P02D02_A252CliCod = new int[1] ;
      P02D02_A494ForSer = new String[] {""} ;
      P02D02_A1192ForNumCli = new int[1] ;
      P02D02_n1192ForNumCli = new boolean[] {false} ;
      P02D02_A482ForColNom = new String[] {""} ;
      P02D02_A483ForColNum = new int[1] ;
      P02D02_A1191ForNomCli = new String[] {""} ;
      P02D02_n1191ForNomCli = new boolean[] {false} ;
      P02D02_A831TipColCod = new byte[1] ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      P02D03_A396EmprCod = new String[] {""} ;
      P02D03_A252CliCod = new int[1] ;
      P02D03_A494ForSer = new String[] {""} ;
      P02D03_A483ForColNum = new int[1] ;
      P02D03_A9792For_Reo = new String[] {""} ;
      P02D03_n9792For_Reo = new boolean[] {false} ;
      P02D03_A482ForColNom = new String[] {""} ;
      P02D03_A1192ForNumCli = new int[1] ;
      P02D03_n1192ForNumCli = new boolean[] {false} ;
      P02D03_A1191ForNomCli = new String[] {""} ;
      P02D03_n1191ForNomCli = new boolean[] {false} ;
      P02D03_A831TipColCod = new byte[1] ;
      A9792For_Reo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuscolk__default(),
         new Object[] {
             new Object[] {
            P02D02_A396EmprCod, P02D02_A252CliCod, P02D02_A494ForSer, P02D02_A1192ForNumCli, P02D02_n1192ForNumCli, P02D02_A482ForColNom, P02D02_A483ForColNum, P02D02_A1191ForNomCli, P02D02_n1191ForNomCli, P02D02_A831TipColCod
            }
            , new Object[] {
            P02D03_A396EmprCod, P02D03_A252CliCod, P02D03_A494ForSer, P02D03_A483ForColNum, P02D03_A9792For_Reo, P02D03_n9792For_Reo, P02D03_A482ForColNom, P02D03_A1192ForNumCli, P02D03_n1192ForNumCli, P02D03_A1191ForNomCli,
            P02D03_n1191ForNomCli, P02D03_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColCod ;
   private byte AV14Kohler ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV9ForNumCli ;
   private int AV11ForColNum ;
   private int AV15Fornumclii ;
   private int AV16Forcolnumi ;
   private int A1192ForNumCli ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String AV8ForNomCli ;
   private String AV10ForColNom ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A9792For_Reo ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n9792For_Reo ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P02D02_A396EmprCod ;
   private int[] P02D02_A252CliCod ;
   private String[] P02D02_A494ForSer ;
   private int[] P02D02_A1192ForNumCli ;
   private boolean[] P02D02_n1192ForNumCli ;
   private String[] P02D02_A482ForColNom ;
   private int[] P02D02_A483ForColNum ;
   private String[] P02D02_A1191ForNomCli ;
   private boolean[] P02D02_n1191ForNomCli ;
   private byte[] P02D02_A831TipColCod ;
   private String[] P02D03_A396EmprCod ;
   private int[] P02D03_A252CliCod ;
   private String[] P02D03_A494ForSer ;
   private int[] P02D03_A483ForColNum ;
   private String[] P02D03_A9792For_Reo ;
   private boolean[] P02D03_n9792For_Reo ;
   private String[] P02D03_A482ForColNom ;
   private int[] P02D03_A1192ForNumCli ;
   private boolean[] P02D03_n1192ForNumCli ;
   private String[] P02D03_A1191ForNomCli ;
   private boolean[] P02D03_n1191ForNomCli ;
   private byte[] P02D03_A831TipColCod ;
}

final  class pbuscolk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02D02", "SELECT EmprCod, CliCod, ForSer, ForNumCli, ForColNom, ForColNum, ForNomCli, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForNumCli = ? ORDER BY EmprCod, CliCod, ForSer, ForNumCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02D03", "SELECT EmprCod, CliCod, ForSer, ForColNum, For_Reo, ForColNom, ForNumCli, ForNomCli, TipColCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ?) AND (ForColNum = ?) ORDER BY EmprCod, CliCod, ForSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

