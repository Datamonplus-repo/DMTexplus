package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlsit extends GXProcedure
{
   public pctrlsit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlsit.class ), "" );
   }

   public pctrlsit( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          String[] aP2 )
   {
      pctrlsit.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pctrlsit.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlsit.this.AV9Forcolnom = aP1[0];
      this.aP1 = aP1;
      pctrlsit.this.AV10Forblo = aP2[0];
      this.aP2 = aP2;
      pctrlsit.this.AV11Num_f = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Num_f = 0 ;
      /* Using cursor P01LF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9Forcolnom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A482ForColNom = P01LF2_A482ForColNom[0] ;
         A7781ForBlo = P01LF2_A7781ForBlo[0] ;
         n7781ForBlo = P01LF2_n7781ForBlo[0] ;
         A252CliCod = P01LF2_A252CliCod[0] ;
         A494ForSer = P01LF2_A494ForSer[0] ;
         A483ForColNum = P01LF2_A483ForColNum[0] ;
         A831TipColCod = P01LF2_A831TipColCod[0] ;
         A7781ForBlo = AV10Forblo ;
         n7781ForBlo = false ;
         AV11Num_f = (int)(AV11Num_f+1) ;
         /* Using cursor P01LF3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7781ForBlo), A7781ForBlo, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlsit.this.A396EmprCod;
      this.aP1[0] = pctrlsit.this.AV9Forcolnom;
      this.aP2[0] = pctrlsit.this.AV10Forblo;
      this.aP3[0] = pctrlsit.this.AV11Num_f;
      Application.commitDataStores(context, remoteHandle, pr_default, "pctrlsit");
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
      P01LF2_A396EmprCod = new String[] {""} ;
      P01LF2_A482ForColNom = new String[] {""} ;
      P01LF2_A7781ForBlo = new String[] {""} ;
      P01LF2_n7781ForBlo = new boolean[] {false} ;
      P01LF2_A252CliCod = new int[1] ;
      P01LF2_A494ForSer = new String[] {""} ;
      P01LF2_A483ForColNum = new int[1] ;
      P01LF2_A831TipColCod = new byte[1] ;
      A482ForColNom = "" ;
      A7781ForBlo = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlsit__default(),
         new Object[] {
             new Object[] {
            P01LF2_A396EmprCod, P01LF2_A482ForColNom, P01LF2_A7781ForBlo, P01LF2_n7781ForBlo, P01LF2_A252CliCod, P01LF2_A494ForSer, P01LF2_A483ForColNum, P01LF2_A831TipColCod
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
   private int AV11Num_f ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String AV9Forcolnom ;
   private String AV10Forblo ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A7781ForBlo ;
   private String A494ForSer ;
   private boolean n7781ForBlo ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LF2_A396EmprCod ;
   private String[] P01LF2_A482ForColNom ;
   private String[] P01LF2_A7781ForBlo ;
   private boolean[] P01LF2_n7781ForBlo ;
   private int[] P01LF2_A252CliCod ;
   private String[] P01LF2_A494ForSer ;
   private int[] P01LF2_A483ForColNum ;
   private byte[] P01LF2_A831TipColCod ;
}

final  class pctrlsit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LF2", "SELECT EmprCod, ForColNom, ForBlo, CliCod, ForSer, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and ForColNom = ? ORDER BY EmprCod, ForColNom ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01LF3", "UPDATE TXPCFORMU SET ForBlo=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
               stmt.setString(2, (String)parms[1], 13);
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

