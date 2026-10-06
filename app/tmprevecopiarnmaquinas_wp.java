package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmprevecopiarnmaquinas_wp", "/app.tmprevecopiarnmaquinas_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmprevecopiarnmaquinas_wp extends GXWebObjectStub
{
   public tmprevecopiarnmaquinas_wp( )
   {
   }

   public tmprevecopiarnmaquinas_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmprevecopiarnmaquinas_wp.class ));
   }

   public tmprevecopiarnmaquinas_wp( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmprevecopiarnmaquinas_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmprevecopiarnmaquinas_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Copiar Preventivo a n Máquinas";
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

