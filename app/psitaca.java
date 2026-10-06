package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psitaca extends GXProcedure
{
   public psitaca( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psitaca.class ), "" );
   }

   public psitaca( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      psitaca.this.aP2 = new String[] {""};
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
      psitaca.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psitaca.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      psitaca.this.AV16PRIO = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00B92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16PRIO});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A16AlbComEst = P00B92_A16AlbComEst[0] ;
         A22AlbComPri = P00B92_A22AlbComPri[0] ;
         A252CliCod = P00B92_A252CliCod[0] ;
         A1783AlbComEso = P00B92_A1783AlbComEso[0] ;
         A14AlbComCod = P00B92_A14AlbComCod[0] ;
         if ( A1783AlbComEso == 1 )
         {
            A1783AlbComEso = (byte)(2) ;
         }
         /* Using cursor P00B93 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A1783AlbComEso), A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psitaca.this.A396EmprCod;
      this.aP1[0] = psitaca.this.AV15CliCod;
      this.aP2[0] = psitaca.this.AV16PRIO;
      Application.commitDataStores(context, remoteHandle, pr_default, "psitaca");
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
      P00B92_A396EmprCod = new String[] {""} ;
      P00B92_A16AlbComEst = new byte[1] ;
      P00B92_A22AlbComPri = new String[] {""} ;
      P00B92_A252CliCod = new int[1] ;
      P00B92_A1783AlbComEso = new byte[1] ;
      P00B92_A14AlbComCod = new int[1] ;
      A22AlbComPri = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psitaca__default(),
         new Object[] {
             new Object[] {
            P00B92_A396EmprCod, P00B92_A16AlbComEst, P00B92_A22AlbComPri, P00B92_A252CliCod, P00B92_A1783AlbComEso, P00B92_A14AlbComCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int A252CliCod ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String AV16PRIO ;
   private String scmdbuf ;
   private String A22AlbComPri ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00B92_A396EmprCod ;
   private byte[] P00B92_A16AlbComEst ;
   private String[] P00B92_A22AlbComPri ;
   private int[] P00B92_A252CliCod ;
   private byte[] P00B92_A1783AlbComEso ;
   private int[] P00B92_A14AlbComCod ;
}

final  class psitaca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00B92", "SELECT EmprCod, AlbComEst, AlbComPri, CliCod, AlbComEso, AlbComCod FROM TXPCALCOM WHERE (EmprCod = ? and AlbComEst = 2) AND (CliCod = ?) AND (AlbComPri = ?) ORDER BY EmprCod, AlbComEst ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00B93", "UPDATE TXPCALCOM SET AlbComEso=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

