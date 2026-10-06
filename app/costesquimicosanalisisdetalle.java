package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesquimicosanalisisdetalle", "/app.costesquimicosanalisisdetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class costesquimicosanalisisdetalle extends GXWebObjectStub
{
   public costesquimicosanalisisdetalle( )
   {
   }

   public costesquimicosanalisisdetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( costesquimicosanalisisdetalle.class ));
   }

   public costesquimicosanalisisdetalle( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new costesquimicosanalisisdetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new costesquimicosanalisisdetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Quimicos Analisis Detalle";
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

