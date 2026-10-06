package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbarpdef", "/app.tbarpdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbarpdef extends GXWebObjectStub
{
   public tbarpdef( )
   {
   }

   public tbarpdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbarpdef.class ));
   }

   public tbarpdef( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbarpdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbarpdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Defectos a nivel de BARPIE";
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

