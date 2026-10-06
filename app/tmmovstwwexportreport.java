package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmmovstwwexportreport", "/app.tmmovstwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovstwwexportreport extends GXWebObjectStub
{
   public tmmovstwwexportreport( )
   {
   }

   public tmmovstwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovstwwexportreport.class ));
   }

   public tmmovstwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovstwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovstwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Movimientos de Stock";
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

