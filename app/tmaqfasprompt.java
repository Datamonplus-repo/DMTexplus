package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqfasprompt", "/app.tmaqfasprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqfasprompt extends GXWebObjectStub
{
   public tmaqfasprompt( )
   {
   }

   public tmaqfasprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqfasprompt.class ));
   }

   public tmaqfasprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqfasprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqfasprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona MAQUINAS POR FASE";
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

