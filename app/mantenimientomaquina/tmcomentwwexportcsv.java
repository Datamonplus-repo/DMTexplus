package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmcomentwwexportcsv", "/app.mantenimientomaquina.tmcomentwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcomentwwexportcsv extends GXWebObjectStub
{
   public tmcomentwwexportcsv( )
   {
   }

   public tmcomentwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcomentwwexportcsv.class ));
   }

   public tmcomentwwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcomentwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcomentwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMCom Ent WWExport CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

