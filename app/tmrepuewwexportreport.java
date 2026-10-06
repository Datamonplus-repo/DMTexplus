package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmrepuewwexportreport", "/app.tmrepuewwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepuewwexportreport extends GXWebObjectStub
{
   public tmrepuewwexportreport( )
   {
   }

   public tmrepuewwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepuewwexportreport.class ));
   }

   public tmrepuewwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepuewwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepuewwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Respuestos";
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

