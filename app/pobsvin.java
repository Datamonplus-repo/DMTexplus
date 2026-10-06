package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobsvin extends GXProcedure
{
   public pobsvin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobsvin.class ), "" );
   }

   public pobsvin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           int[] aP6 ,
                           int[] aP7 )
   {
      pobsvin.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 )
   {
      pobsvin.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pobsvin.this.AV9CliCod = aP1[0];
      this.aP1 = aP1;
      pobsvin.this.AV10DisArtCod = aP2[0];
      this.aP2 = aP2;
      pobsvin.this.AV11ForColNom = aP3[0];
      this.aP3 = aP3;
      pobsvin.this.AV12ForColNum = aP4[0];
      this.aP4 = aP4;
      pobsvin.this.AV13TipColCod = aP5[0];
      this.aP5 = aP5;
      pobsvin.this.AV14DisCod = aP6[0];
      this.aP6 = aP6;
      pobsvin.this.AV15ContVal = aP7[0];
      this.aP7 = aP7;
      pobsvin.this.AV22Flag = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17ContLin = (byte)(0) ;
      /* Using cursor P028B2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), AV10DisArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3072ArtObsLon = P028B2_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P028B2_n3072ArtObsLon[0] ;
         A65ArtCod = P028B2_A65ArtCod[0] ;
         A252CliCod = P028B2_A252CliCod[0] ;
         A396EmprCod = P028B2_A396EmprCod[0] ;
         AV20Nlin = (short)(GXutil.gxmlines( A3072ArtObsLon, (short)(60))) ;
         AV21I = (short)(1) ;
         while ( AV21I <= AV20Nlin )
         {
            AV18ObsTxt = GXutil.gxgetmli( A3072ArtObsLon, AV21I, (short)(60)) ;
            /* Execute user subroutine: 'ACTU_OBSVINCOL' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV21I = (short)(AV21I+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV23Obslin = (short)(0) ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV19ObsForTxt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P028B3 */
      pr_default.execute(1, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), AV10DisArtCod, AV11ForColNom, Integer.valueOf(AV12ForColNum), Byte.valueOf(AV13TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P028B3_A831TipColCod[0] ;
         A483ForColNum = P028B3_A483ForColNum[0] ;
         A482ForColNom = P028B3_A482ForColNom[0] ;
         A494ForSer = P028B3_A494ForSer[0] ;
         A252CliCod = P028B3_A252CliCod[0] ;
         A396EmprCod = P028B3_A396EmprCod[0] ;
         A649ObsForTxt = P028B3_A649ObsForTxt[0] ;
         A650ObsLin = P028B3_A650ObsLin[0] ;
         AV23Obslin = (short)(AV23Obslin+1) ;
         AV19ObsForTxt[AV23Obslin-1] = A649ObsForTxt ;
         if ( AV23Obslin == 2 )
         {
            AV18ObsTxt = AV19ObsForTxt[1-1] + " " + AV19ObsForTxt[2-1] ;
            /* Execute user subroutine: 'ACTU_OBSVINCOL' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV23Obslin > 0 )
      {
         AV18ObsTxt = AV19ObsForTxt[1-1] + " " + AV19ObsForTxt[2-1] ;
         /* Execute user subroutine: 'ACTU_OBSVINCOL' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ACTU_OBSVINCOL' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPBARNOT

      */
      AV17ContLin = (byte)(AV17ContLin+1) ;
      A396EmprCod = AV8EmprCod ;
      if ( AV22Flag == 0 )
      {
         A129BarCod = AV14DisCod ;
      }
      else
      {
         A129BarCod = AV15ContVal ;
      }
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = " " ;
      A188BarNotLin = AV17ContLin ;
      A187BarNotDsc = AV18ObsTxt ;
      /* Using cursor P028B4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A188BarNotLin), A187BarNotDsc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      AV24Cont_not = AV17ContLin ;
      AV23Obslin = (short)(0) ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV19ObsForTxt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pobsvin.this.AV8EmprCod;
      this.aP1[0] = pobsvin.this.AV9CliCod;
      this.aP2[0] = pobsvin.this.AV10DisArtCod;
      this.aP3[0] = pobsvin.this.AV11ForColNom;
      this.aP4[0] = pobsvin.this.AV12ForColNum;
      this.aP5[0] = pobsvin.this.AV13TipColCod;
      this.aP6[0] = pobsvin.this.AV14DisCod;
      this.aP7[0] = pobsvin.this.AV15ContVal;
      this.aP8[0] = pobsvin.this.AV22Flag;
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
      P028B2_A3072ArtObsLon = new String[] {""} ;
      P028B2_n3072ArtObsLon = new boolean[] {false} ;
      P028B2_A65ArtCod = new String[] {""} ;
      P028B2_A252CliCod = new int[1] ;
      P028B2_A396EmprCod = new String[] {""} ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      AV18ObsTxt = "" ;
      AV19ObsForTxt = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV19ObsForTxt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P028B3_A831TipColCod = new byte[1] ;
      P028B3_A483ForColNum = new int[1] ;
      P028B3_A482ForColNom = new String[] {""} ;
      P028B3_A494ForSer = new String[] {""} ;
      P028B3_A252CliCod = new int[1] ;
      P028B3_A396EmprCod = new String[] {""} ;
      P028B3_A649ObsForTxt = new String[] {""} ;
      P028B3_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A649ObsForTxt = "" ;
      A130BarCodPar = "" ;
      A187BarNotDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pobsvin__default(),
         new Object[] {
             new Object[] {
            P028B2_A3072ArtObsLon, P028B2_n3072ArtObsLon, P028B2_A65ArtCod, P028B2_A252CliCod, P028B2_A396EmprCod
            }
            , new Object[] {
            P028B3_A831TipColCod, P028B3_A483ForColNum, P028B3_A482ForColNom, P028B3_A494ForSer, P028B3_A252CliCod, P028B3_A396EmprCod, P028B3_A649ObsForTxt, P028B3_A650ObsLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13TipColCod ;
   private byte AV22Flag ;
   private byte AV17ContLin ;
   private byte A831TipColCod ;
   private byte A132BarCodReo ;
   private byte A188BarNotLin ;
   private byte AV24Cont_not ;
   private short AV20Nlin ;
   private short AV21I ;
   private short AV23Obslin ;
   private short A650ObsLin ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV12ForColNum ;
   private int AV14DisCod ;
   private int AV15ContVal ;
   private int A252CliCod ;
   private int GX_I ;
   private int A483ForColNum ;
   private int GX_INS17 ;
   private int A129BarCod ;
   private String AV8EmprCod ;
   private String AV10DisArtCod ;
   private String AV11ForColNom ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String AV18ObsTxt ;
   private String AV19ObsForTxt[] ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A649ObsForTxt ;
   private String A130BarCodPar ;
   private String A187BarNotDsc ;
   private String Gx_emsg ;
   private boolean n3072ArtObsLon ;
   private boolean returnInSub ;
   private String A3072ArtObsLon ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P028B2_A3072ArtObsLon ;
   private boolean[] P028B2_n3072ArtObsLon ;
   private String[] P028B2_A65ArtCod ;
   private int[] P028B2_A252CliCod ;
   private String[] P028B2_A396EmprCod ;
   private byte[] P028B3_A831TipColCod ;
   private int[] P028B3_A483ForColNum ;
   private String[] P028B3_A482ForColNom ;
   private String[] P028B3_A494ForSer ;
   private int[] P028B3_A252CliCod ;
   private String[] P028B3_A396EmprCod ;
   private String[] P028B3_A649ObsForTxt ;
   private short[] P028B3_A650ObsLin ;
}

final  class pobsvin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028B2", "SELECT ArtObsLon, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028B3", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028B4", "INSERT INTO TXPBARNOT(EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 65);
               return;
      }
   }

}

