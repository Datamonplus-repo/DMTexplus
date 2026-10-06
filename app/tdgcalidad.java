package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdgcalidad", "/app.tdgcalidad"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdgcalidad extends GXWebObjectStub
{
   public tdgcalidad( )
   {
   }

   public tdgcalidad( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdgcalidad.class ));
   }

   public tdgcalidad( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdgcalidad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdgcalidad_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALIDADES ESTAMPACION DIGITAL";
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

