package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.procesoquimico_duplicar", "/app.formulaciontinte.procesoquimico_duplicar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class procesoquimico_duplicar extends GXWebObjectStub
{
   public procesoquimico_duplicar( )
   {
   }

   public procesoquimico_duplicar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( procesoquimico_duplicar.class ));
   }

   public procesoquimico_duplicar( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new procesoquimico_duplicar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new procesoquimico_duplicar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Proceso Quimico Duplicar";
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

