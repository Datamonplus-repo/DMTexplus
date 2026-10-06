package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttproduc", "/app.ttproduc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttproduc extends GXWebObjectStub
{
   public ttproduc( )
   {
   }

   public ttproduc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttproduc.class ));
   }

   public ttproduc( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttproduc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttproduc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Productos Quimicos";
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

