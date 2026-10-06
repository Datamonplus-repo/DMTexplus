package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnortt extends GXProcedure
{
   public pnortt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnortt.class ), "" );
   }

   public pnortt( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pnortt.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pnortt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnortt.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnortt.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnortt.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnortt.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09C72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P09C72_A361DisCod[0] ;
         A135BarColNom = P09C72_A135BarColNom[0] ;
         AV9DistraID = "" ;
         /* Using cursor P09C73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13376DisTraID = P09C73_A13376DisTraID[0] ;
            AV9DistraID = A13376DisTraID ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P09C74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13905BarTraID = P09C74_A13905BarTraID[0] ;
            AV9DistraID = A13905BarTraID ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV10Normas = "" ;
         /* Using cursor P09C75 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A13213DisNormID = P09C75_A13213DisNormID[0] ;
            if ( GXutil.strcmp(AV10Normas, "") == 0 )
            {
               AV10Normas = GXutil.trim( A13213DisNormID) ;
            }
            else
            {
               AV10Normas += "/" + GXutil.trim( A13213DisNormID) ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV8Color = ((GXutil.strcmp("", AV10Normas)==0) ? GXutil.trim( A135BarColNom)+" "+GXutil.trim( AV9DistraID) : GXutil.trim( AV10Normas)+" "+GXutil.trim( A135BarColNom)+" "+GXutil.trim( AV9DistraID)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnortt.this.A396EmprCod;
      this.aP1[0] = pnortt.this.A129BarCod;
      this.aP2[0] = pnortt.this.A132BarCodReo;
      this.aP3[0] = pnortt.this.A130BarCodPar;
      this.aP4[0] = pnortt.this.AV8Color;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Color = "" ;
      scmdbuf = "" ;
      P09C72_A396EmprCod = new String[] {""} ;
      P09C72_A129BarCod = new int[1] ;
      P09C72_A132BarCodReo = new byte[1] ;
      P09C72_A130BarCodPar = new String[] {""} ;
      P09C72_A361DisCod = new int[1] ;
      P09C72_A135BarColNom = new String[] {""} ;
      A135BarColNom = "" ;
      AV9DistraID = "" ;
      P09C73_A396EmprCod = new String[] {""} ;
      P09C73_A361DisCod = new int[1] ;
      P09C73_A13376DisTraID = new String[] {""} ;
      A13376DisTraID = "" ;
      P09C74_A396EmprCod = new String[] {""} ;
      P09C74_A129BarCod = new int[1] ;
      P09C74_A132BarCodReo = new byte[1] ;
      P09C74_A130BarCodPar = new String[] {""} ;
      P09C74_A13905BarTraID = new String[] {""} ;
      A13905BarTraID = "" ;
      AV10Normas = "" ;
      P09C75_A396EmprCod = new String[] {""} ;
      P09C75_A361DisCod = new int[1] ;
      P09C75_A13213DisNormID = new String[] {""} ;
      A13213DisNormID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnortt__default(),
         new Object[] {
             new Object[] {
            P09C72_A396EmprCod, P09C72_A129BarCod, P09C72_A132BarCodReo, P09C72_A130BarCodPar, P09C72_A361DisCod, P09C72_A135BarColNom
            }
            , new Object[] {
            P09C73_A396EmprCod, P09C73_A361DisCod, P09C73_A13376DisTraID
            }
            , new Object[] {
            P09C74_A396EmprCod, P09C74_A129BarCod, P09C74_A132BarCodReo, P09C74_A130BarCodPar, P09C74_A13905BarTraID
            }
            , new Object[] {
            P09C75_A396EmprCod, P09C75_A361DisCod, P09C75_A13213DisNormID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Color ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String AV9DistraID ;
   private String A13376DisTraID ;
   private String A13905BarTraID ;
   private String AV10Normas ;
   private String A13213DisNormID ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09C72_A396EmprCod ;
   private int[] P09C72_A129BarCod ;
   private byte[] P09C72_A132BarCodReo ;
   private String[] P09C72_A130BarCodPar ;
   private int[] P09C72_A361DisCod ;
   private String[] P09C72_A135BarColNom ;
   private String[] P09C73_A396EmprCod ;
   private int[] P09C73_A361DisCod ;
   private String[] P09C73_A13376DisTraID ;
   private String[] P09C74_A396EmprCod ;
   private int[] P09C74_A129BarCod ;
   private byte[] P09C74_A132BarCodReo ;
   private String[] P09C74_A130BarCodPar ;
   private String[] P09C74_A13905BarTraID ;
   private String[] P09C75_A396EmprCod ;
   private int[] P09C75_A361DisCod ;
   private String[] P09C75_A13213DisNormID ;
}

final  class pnortt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09C72", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod, BarColNom FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09C73", "SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09C74", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09C75", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

