package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpreclamacionesynoconformidades", "/app.wpreclamacionesynoconformidades"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpreclamacionesynoconformidades extends GXWebObjectStub
{
   public wpreclamacionesynoconformidades( )
   {
   }

   public wpreclamacionesynoconformidades( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpreclamacionesynoconformidades.class ));
   }

   public wpreclamacionesynoconformidades( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpreclamacionesynoconformidades_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpreclamacionesynoconformidades_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Reoperados Internos, Externos";
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

