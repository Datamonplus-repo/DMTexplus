package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmrcomwwexportreport", "/app.mantenimientomaquina.tmrcomwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrcomwwexportreport extends GXWebObjectStub
{
   public tmrcomwwexportreport( )
   {
   }

   public tmrcomwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrcomwwexportreport.class ));
   }

   public tmrcomwwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrcomwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrcomwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRCom WWExport Report";
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

