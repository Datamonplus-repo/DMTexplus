package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdventalm", "/app.tdventalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdventalm extends GXWebObjectStub
{
   public tdventalm( )
   {
   }

   public tdventalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdventalm.class ));
   }

   public tdventalm( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdventalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdventalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entradas Productos Quimicos Data View";
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

