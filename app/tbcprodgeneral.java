package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbcprodgeneral", "/app.tbcprodgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbcprodgeneral extends GXWebObjectStub
{
   public tbcprodgeneral( )
   {
   }

   public tbcprodgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbcprodgeneral.class ));
   }

   public tbcprodgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbcprodgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbcprodgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TBCPRODGeneral";
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

