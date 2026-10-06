package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.procesosquimicos_trngeneral", "/app.formulaciontinte.procesosquimicos_trngeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class procesosquimicos_trngeneral extends GXWebObjectStub
{
   public procesosquimicos_trngeneral( )
   {
   }

   public procesosquimicos_trngeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( procesosquimicos_trngeneral.class ));
   }

   public procesosquimicos_trngeneral( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new procesosquimicos_trngeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new procesosquimicos_trngeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Quimicos_TRNGeneral";
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

