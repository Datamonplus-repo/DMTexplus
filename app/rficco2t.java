package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rficco2t", "/app.rficco2t"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rficco2t extends GXWebObjectStub
{
   public rficco2t( )
   {
   }

   public rficco2t( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rficco2t.class ));
   }

   public rficco2t( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rficco2t_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rficco2t_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA COLOR";
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

